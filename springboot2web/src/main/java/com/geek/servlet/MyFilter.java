package com.geek.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author Robert
 * @create 2020/12/29 9:45
 * @Version 1.0
 * @Description:
 */

@Slf4j
//@WebFilter
//@WebFilter(urlPatterns = "/")//可以配置想要拦截的路径
public class MyFilter implements Filter {
    @Override//filter 初始化
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override//filter 销毁
    public void destroy() {

    }
}
