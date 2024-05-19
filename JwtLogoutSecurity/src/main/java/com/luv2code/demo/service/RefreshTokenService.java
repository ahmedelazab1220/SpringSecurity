package com.luv2code.demo.service;

import com.luv2code.demo.entity.RefreshToken;

public interface RefreshTokenService {

	RefreshToken save(RefreshToken refreshToken);

	RefreshToken findByToken(String token);

	void deleteByEntity(RefreshToken refreshToken);

}
