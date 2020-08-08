package com.byeongukchoi.oauth2.server.repository;

import com.byeongukchoi.oauth2.server.dto.AuthorizationRequestDto;
import com.byeongukchoi.oauth2.server.entity.RefreshToken;

/**
 * RefreshTokenRepository interface
 */
public interface RefreshTokenRepository {
    public RefreshToken getNewToken(AuthorizationRequestDto authorizationRequestDto, String accessToken);
    public void saveNewToken(RefreshToken refreshToken);
    public RefreshToken findByTokenAndClientId(String refreshToken, String clientId);
    public void expireToken(RefreshToken refreshToken);
}
