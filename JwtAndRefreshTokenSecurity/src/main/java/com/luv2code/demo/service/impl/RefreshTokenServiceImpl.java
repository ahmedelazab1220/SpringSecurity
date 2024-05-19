package com.luv2code.demo.service.impl;

import java.time.Instant;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.demo.entity.RefreshToken;
import com.luv2code.demo.exc.custom.NotFoundRefreshTokenException;
import com.luv2code.demo.exc.custom.RefreshTokenExpiredException;
import com.luv2code.demo.repo.RefreshTokenRepository;
import com.luv2code.demo.service.RefreshTokenService;

@Service
public class RefreshTokenServiceImpl implements RefreshTokenService {

	@Autowired
	private RefreshTokenRepository refreshTokenRepository;

	@Override
	public RefreshToken save(RefreshToken refreshToken) {
		return refreshTokenRepository.save(refreshToken);
	}

	@Override
	public RefreshToken findByToken(String token) {
		Optional<RefreshToken> refreshToken = refreshTokenRepository.findByToken(token);

		if (refreshToken.isEmpty()) {
			throw new NotFoundRefreshTokenException("Not Found Token OR Revoked!");
		}

		if (refreshToken.get().getExpiryDate().compareTo(Instant.now()) < 0) {
			throw new RefreshTokenExpiredException("Refresh token is expired. Please make a new login..!");
		}
		
		return refreshToken.get();
	}

	@Override
	public void deleteByEntity(RefreshToken refreshToken) {
		refreshTokenRepository.delete(refreshToken);
	}

}
