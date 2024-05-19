package com.luv2code.demo.service.impl;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Service;

import com.luv2code.demo.service.RefreshTokenService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LogoutHandlerImpl implements LogoutHandler {

	private final RefreshTokenService refreshTokenService;

	@Override
	public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {

		String authHeader = request.getHeader("Authorization");
		String jwt = null;
		if (authHeader != null && authHeader.startsWith("Bearer ")) {
			jwt = authHeader.substring(7);
		}

		refreshTokenService.deleteByEntity(refreshTokenService.findByToken(jwt));

		handleLogoutSuccess(request, response);
	}

	private void handleLogoutSuccess(HttpServletRequest request, HttpServletResponse response) {
		response.setStatus(HttpServletResponse.SC_OK);
	}

}
