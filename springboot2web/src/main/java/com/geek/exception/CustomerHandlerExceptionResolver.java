package com.geek.exception;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Robert
 * @create 2020/12/29 9:24
 * @Version 1.0
 * @Description:
 */

@Order() //异常处理器优先级 数字越小优先级越高
@Component
public class CustomerHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o, Exception e) {

        try {
            httpServletResponse.sendError(511,"My exception");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return new ModelAndView();
    }
}
