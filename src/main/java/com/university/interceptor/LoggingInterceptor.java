package com.university.interceptor;

import javax.servlet.http.*;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoggingInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) {
        System.out.println("Request URI: " + req.getRequestURI());
        return true;
    }
}
