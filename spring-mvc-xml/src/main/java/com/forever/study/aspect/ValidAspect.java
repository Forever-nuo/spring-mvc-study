package com.forever.study.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Forever丶诺
 * @date: 2018/4/26 17:03
 */
@Aspect
@Component
public class ValidAspect implements ThrowsAdvice {

    @Pointcut("execution(* com.forever.study.controller.ValidController.*(..,org.springframework.validation.BindingResult))")
    public void pointCut() {

    }


    @Around("pointCut()")
    @ResponseBody
    public Map beforeMethod(ProceedingJoinPoint point) throws Throwable {
        Map map = new HashMap();
        map.put("name","张三");
        Object[] args = point.getArgs();
        for (Object arg : args) {
            if (arg instanceof BindingResult) {
                BindingResult bindingResult = (BindingResult) arg;
                if (bindingResult.hasErrors()) {
                    List<ObjectError> allErrors = bindingResult.getAllErrors();
                    for (ObjectError allError : allErrors) {
                        System.out.println(allError.getObjectName() + allError.getDefaultMessage());
                    }
                    return map;
                }
            }
        }
        System.out.println("目标方法执行之前");
        return map;
    }


}
