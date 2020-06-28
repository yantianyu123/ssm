package com.yan.spring02.component;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author
 * @date 2020/6/26 16:25
 */

@Aspect
@Component
public class AspectComponent {

    @Around("execution(* com.yan.spring02.aop.MathImpl.*(..))")
    public Object beforeMethod(ProceedingJoinPoint joinPoint) {
        //获取方法参数
        Object[] args = joinPoint.getArgs();
        Object proceed = null;
        try {
            System.out.println("前置通知");
            proceed = joinPoint.proceed(args);
            System.out.println("返回通知");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("异常通知");
        }finally {
            System.out.println("后置通知");
        }
        return proceed;
    }
}
