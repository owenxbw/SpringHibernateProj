package net.antra.springdemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class DemoAspect {
	
//	@Before("execution(* *.save*(..))")
//    public void getNameAdvice(){
//        System.out.println("before save*");
//    }
//	@After("execution(* *.save*(..))")
//	public void afterMethod(){
//		System.out.println("after save*");
//	}
	@Around("execution(* *.save*(..))")
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Before invoking save() method");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("After invoking save() method. Return value="+value);
        return value;
    }
}
