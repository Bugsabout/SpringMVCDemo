package wuxl.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 吴小龙
 * @version V1.0
 * @Package wuxl.study.controller
 * @date 2020/6/13 10:39
 * @Description //TODO
 * @Copyright © 2020 上海安科瑞电气股份有限公司
 */
@Controller//Controller本质是一个Servlet的接口，类通过 implements Controller实现路径跳转控制，同时还要在springmvc-servlet中配置这个路径才可以
@RequestMapping("main")
public class MainController {

    @RequestMapping(value = "test")
    public String testmethod(){
        System.out.println("testController Success");
        return null;
    }
}
