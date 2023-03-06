package com.api.NifsAPIServer.aop;

import com.api.NifsAPIServer.exception.CustomAuthenticationException;
import com.api.NifsAPIServer.service.Nifs2DataDAO;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.cglib.proxy.UndeclaredThrowableException;
import org.springframework.stereotype.Component;


@Component
@Aspect
@RequiredArgsConstructor
public class ApiKeyAuthenticationAspect {
    private final Nifs2DataDAO service;


    @Before("@annotation(apiKeyAuthenticated)")
    public void authenticate(JoinPoint joinPoint, ApiKeyAuthenticated apiKeyAuthenticated) throws Exception {
        var args = joinPoint.getArgs();
        if (args.length > 0) {
            String serviceKeyQuery = (String) args[0];
            service.keyAuthenticate(serviceKeyQuery);

        }
    }

}
