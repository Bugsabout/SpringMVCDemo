package wuxl.study.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 吴小龙
 * @version V1.0
 * @Package wuxl.study.aop
 * @date 2020/6/24 23:10
 * @Description //TODO
 * @Copyright © 2020 上海安科瑞电气股份有限公司
 */
@Aspect
@Component
public class LoggerAspect {
    //注意execution的通配符如果写错了会报错：
    @Around(value = "execution(* wuxl.study.controller.IndexController.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start log:" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log:" + joinPoint.getSignature().getName());
        return object;
    }
}
