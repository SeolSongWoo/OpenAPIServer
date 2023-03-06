package com.api.NifsAPIServer.exception;

import javax.security.sasl.AuthenticationException;

public class CustomAuthenticationException extends RuntimeException {

    public CustomAuthenticationException(final String message) {
        super(message);
    }
}
