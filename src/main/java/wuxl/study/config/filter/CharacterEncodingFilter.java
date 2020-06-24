package wuxl.study.config.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: SpringMVCDemo
 * @author: 吴小龙
 * @create: 2020-06-23 08:39
 * @description: 字符集过滤器
 */

public class CharacterEncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化字符集过滤器");
    }



    /**
     * @Author 吴小龙
     * @Date 2020/6/23 9:16
     * @MethodName doFilter
     * @MethodParam [servletRequest, servletResponse, filterChain]
     * @MethodReturn void
     * @Version version V1.0
     * @MethodDescription //filter的启动非常重要，如果filter启动失败，会导致整个项目无法正常使用
     **/
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // PS：将ServletRequest向下转化为HttpServletRequest类，有利于调用一些线程的方法
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        httpServletRequest.setCharacterEncoding("UTF-8");
        System.out.println("字符集过滤器设置成功");
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("字符集过滤器销毁");
    }
}
