package com.cbw0916.oauth2.server.entity;

public interface AuthorizationCode {
    public String getCode();
    public Boolean isExpired();
}
