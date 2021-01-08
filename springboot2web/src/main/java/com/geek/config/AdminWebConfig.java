package com.geek.config;

import com.geek.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Robert
 * @create 2020/12/28 10:41
 * @Version 1.0
 * @Description:
 * 1、编写一个拦截器实现HandlerInterceptor接口
 * 2、拦截器注册到容器中（实现WebMvcConfigurer的addInterceptors）
 * 3、指定拦截规则【如果是拦截所有请求，那么静态资源请求也会被拦截】
 */

@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加一个拦截器
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")//默认为拦截所有请求  也会把所有的静态资源请求给拦截
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**");//放行哪些请求
    }
}
