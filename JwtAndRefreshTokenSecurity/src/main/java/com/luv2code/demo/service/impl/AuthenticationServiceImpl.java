package com.luv2code.demo.service.impl;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.luv2code.demo.dto.mapper.SystemMapper;
import com.luv2code.demo.dto.request.LoginRequest;
import com.luv2code.demo.dto.request.RegisterRequest;
import com.luv2code.demo.dto.response.LoginResponse;
import com.luv2code.demo.entity.RefreshToken;
import com.luv2code.demo.entity.User;
import com.luv2code.demo.repo.UserRepository;
import com.luv2code.demo.service.AuthenticationService;
import com.luv2code.demo.service.JwtService;
import com.luv2code.demo.service.RefreshTokenService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

	private final UserRepository userRepository;
	private final RefreshTokenService refreshTokenService;
	private final PasswordEncoder passwordEncoder;
	private final AuthenticationManager authenticationManager;
	private final SystemMapper mapper;
	private final JwtService jwtService;

	@Override
	public LoginResponse login(LoginRequest loginRequest) {

		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		String accessToken = jwtService.generateToken(loginRequest.getUsername());
		String refreshToken = jwtService.generateRefreshToken(loginRequest.getUsername());

		User user = userRepository.findByUsername(loginRequest.getUsername()).get();

		RefreshToken refresh_token = RefreshToken.builder().token(refreshToken).user(user)
				.expiryDate(jwtService.extractExpiration(refreshToken).toInstant()).build();

		// you must delete previous refresh_token because relation between them is
		// (OneToOne)
		if (user.getRefreshToken() != null) {
			refreshTokenService.deleteByEntity(user.getRefreshToken());
		}

		// then save new refesh_token
		refreshTokenService.save(refresh_token);

		LoginResponse loginResponse = mapper.loginRequestToLoginResponse(loginRequest);
		loginResponse.setAccessToken(accessToken);
		loginResponse.setRefreshToken(refreshToken);

		return loginResponse;
	}

	@Override
	public User signUp(RegisterRequest registerRequest) {
		User user = mapper.registerRequstToUser(registerRequest);
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

}
