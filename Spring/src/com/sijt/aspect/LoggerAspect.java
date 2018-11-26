package com.sijt.aspect;

/**
 * @author sijt
 * @date 2018/11/26 16:36.
 */
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAspect {
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start log:" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log:" + joinPoint.getSignature().getName());
        return object;
    }
}
