package com.api.NifsAPIServer.controller;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

@RestController
public class WrongPathController implements ErrorController {

    @GetMapping("/error")
    public void getErrorPage(HttpServletRequest request) throws NoHandlerFoundException {
        throw new NoHandlerFoundException(request.getMethod(), request.getRequestURI(),null);
    }
}
