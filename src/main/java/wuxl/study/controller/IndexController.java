package wuxl.study.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 吴小龙
 * @version V1.0
 * @Package wuxl.study.controller
 * @date 2020/6/13 13:29
 * @Description //TODO
 * @Copyright © 2020 上海安科瑞电气股份有限公司
 */
//@Controller
public class IndexController implements Controller {
//    @RequestMapping("/index")
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mav = new ModelAndView("index.jsp");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }
}
