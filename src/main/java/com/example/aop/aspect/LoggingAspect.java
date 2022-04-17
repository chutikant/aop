package com.example.aop.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

  @Pointcut("execution(* com.example.aop.controller.Timestamp.record(..))")
  private void loggingControllerPointCut() {
  }

  @Around("loggingControllerPointCut()")
  public Object loggingAroundController(ProceedingJoinPoint joinPoint) throws Throwable {
    log.info("Around /timestamp/record");
    return joinPoint.proceed();
  }

  @Before("execution(* com.example.aop.controller.Timestamp.record(..))")
  public void loggingStartController(){
    log.info("Before /timestamp/record");
  }

  @After("execution(* com.example.aop.controller.Timestamp.record(..))")
  public void loggingFinishController(){
    log.info("After /timestamp/record");
  }

//  @Around("execution(* com.example.aop.controller.Timestamp.record(..))")
//  public Object loggingAroundController(ProceedingJoinPoint joinPoint) throws Throwable {
//    log.info("Around /timestamp/record");
//    return joinPoint.proceed();
//  }

}
