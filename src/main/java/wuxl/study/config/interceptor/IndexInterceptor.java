package wuxl.study.config.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @program: SpringMVCDemo
 * @author: 吴小龙
 * @create: 2020-06-28 15:23
 * @description: 首页拦截器
 */

public class IndexInterceptor extends HandlerInterceptorAdapter {
    public IndexInterceptor() {
        System.out.println("首页拦截器构建");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle(), 在访问Controller之前被调用");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle(), 在访问Controller之后，访问视图之前被调用,这里可以注入一个时间到modelAndView中，用于后续视图显示");
        modelAndView.addObject("date","由拦截器生成的时间:" + new Date());    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion(), 在访问视图之后被调用");     }
}
