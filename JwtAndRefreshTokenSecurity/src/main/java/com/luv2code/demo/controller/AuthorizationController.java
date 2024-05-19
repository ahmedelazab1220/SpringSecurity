package com.luv2code.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.demo.dto.request.RefreshTokenRequest;
import com.luv2code.demo.entity.RefreshToken;
import com.luv2code.demo.entity.User;
import com.luv2code.demo.service.RefreshTokenService;
import com.luv2code.demo.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v2/auth")
@AllArgsConstructor
public class AuthorizationController {

	private final UserService userService;

	private final RefreshTokenService refreshTokenService;

	
	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String admin() {
		return "Hi ADMIN!";
	}

	@GetMapping("/user")
	@PreAuthorize("hasRole('USER')")
	public String user() {
		return "Hi user!";
	}

	@GetMapping("")
	public String demo() {
		return "Hi EveryBody!";
	}

	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<>(userService.findAll(), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/refresh")
	public ResponseEntity<RefreshToken> getrefresh(@RequestBody RefreshTokenRequest refreshTokenRequest) {
		
		return new ResponseEntity<>(refreshTokenService.findByToken(refreshTokenRequest.getRefresh_token()), HttpStatus.ACCEPTED);
	}
}
