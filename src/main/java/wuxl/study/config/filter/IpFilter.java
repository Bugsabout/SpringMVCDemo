package wuxl.study.config.filter;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: SpringMVCDemo
 * @author: 吴小龙
 * @create: 2020-06-23 09:00
 * @description: 拦截获取一些ip信息，登录信息
 */

public class IpFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化ip过滤器");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // PS：将ServletRequest向下转化为HttpServletRequest类，有利于调用一些线程的方法
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        //！！！使用地址拦截器会有一定的问题，如果本机访问，会有一个127.0.0.1的地址，但是
        String contextPath = httpServletRequest.getContextPath();
        System.out.println("用户访问路径："+contextPath+httpServletRequest.getServletPath());
        //有的可能沒有cookie，为了避免报错，需要跳过
        Cookie[] cookies = httpServletRequest.getCookies();
        if(cookies!=null){
            for (Cookie cookie:cookies){
                System.out.println("cookie信息："+cookie.getName()+"："+cookie.getValue());
            }
        }


        String remoteAddr = httpServletRequest.getRemoteAddr();
        System.out.println("远程调用地址："+remoteAddr);
        filterChain.doFilter(httpServletRequest, httpServletResponse);

    }

    @Override
    public void destroy() {
        System.out.println("销毁ip过滤器");
    }
}
