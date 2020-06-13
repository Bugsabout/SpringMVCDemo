package wuxl.study.config.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author 吴小龙
 * @version V1.0
 * @Package wuxl.study.config.listener
 * @date 2020/6/10 21:46
 * @Description //web项目的监听器类，主要用于监听项目是否启动，是否销毁
 * @Copyright © 2020 上海安科瑞电气股份有限公司
 */
public class MyContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Web项目启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("Web项目销毁");
    }
}
