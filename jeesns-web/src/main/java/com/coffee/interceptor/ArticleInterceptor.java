package com.coffee.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArticleInterceptor implements HandlerInterceptor {
    @java.lang.Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, java.lang.Object o) throws Exception {
        System.out.println("=================文章拦截器==================") ;
        return true;
    }

    @java.lang.Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, java.lang.Object o, ModelAndView modelAndView) throws Exception {

    }

    @java.lang.Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, java.lang.Object o, java.lang.Exception e) throws Exception {

    }
}
