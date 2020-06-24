package wuxl.study.config.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: SpringMVCDemo
 * @author: 吴小龙
 * @create: 2020-06-23 09:18
 * @description: 登录验证过滤器
 */

public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("登录验证过滤器启动");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // PS：将ServletRequest向下转化为HttpServletRequest类，有利于调用一些线程的方法
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        String uri = httpServletRequest.getRequestURI();
        if (uri.endsWith("login.html") || uri.endsWith("login")) {
            filterChain.doFilter(httpServletRequest, httpServletResponse);
            return;
        }

        String userName = (String) httpServletRequest.getSession().getAttribute("userName");
        if (null == userName) {
            httpServletResponse.sendRedirect("login.html");
            return;
        }

        filterChain.doFilter(httpServletRequest, httpServletResponse);

    }

    @Override
    public void destroy() {
        System.out.println("登录验证过滤器销毁");
    }
}
