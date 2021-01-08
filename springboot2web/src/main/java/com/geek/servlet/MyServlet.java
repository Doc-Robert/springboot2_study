package com.geek.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Robert
 * @create 2020/12/29 9:37
 * @Version 1.0
 * @Description:
 */

//@WebServlet(urlPatterns = "/my")//配置servlet请求路径
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("77777");
    }
}
