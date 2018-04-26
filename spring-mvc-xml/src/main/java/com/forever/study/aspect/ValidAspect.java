package com.forever.study.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author: Forever丶诺
 * @date: 2018/4/26 17:03
 */
@Aspect
@Component
public class ValidAspect {

    @Pointcut("execution(* com.forever.study.controller.ValidController.*(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void beforeMethod() {
        System.out.println("目标方法执行之前");
    }

    @AfterThrowing("pointCut()")
    public void validThrow() {
        System.out.println("异常方法执行");
    }

}
