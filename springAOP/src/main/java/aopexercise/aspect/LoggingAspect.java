package aopexercise.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.io.IOException;

@Aspect
public class LoggingAspect {

    //Question 1
    @Before("execution(* aopexercise.component.Q1Service.*(..))")
    public void LoggingAdvice(){

        System.out.println("Advice run. Method logged");
    }

    //Question 2
    @Around("execution(void aopexercise.component.Q2.display())")
    public void beforeandafter(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("Advice run.Before the method call");
        proceedingJoinPoint.proceed();
        System.out.println("Advice run.After the  method call");
    }

    //Question 3
    @AfterThrowing(pointcut="execution(* aopexercise.component.Q3.*(..))", throwing="e")
    public void logafterthrowing(IOException e){

        System.out.println("Advice run. exception is "+e);
    }

    //Question 4
    @Before("@annotation(Deprecated)")
    public void logfordeprecatedmethod()
    {
        System.out.println("Advice run before deprecated method call");
    }

    //Question 5

    //execution
    @Before("execution(void aopexercise.component.Q5.method1())")
    public void q5beforeExecutionlog()
    {
        System.out.println("Advice run before method 1 using execution ");
    }

    @After("execution(void aopexercise.component.Q5.method1())")
    public void q5afterExecutionlog()
    {
        System.out.println("Advice run after method 1 using execution ");
    }

    //within
    @Before("within(aopexercise.component.Q5)")
    void q5beforeWithinlog()
    {
        System.out.println("Advice run before method using within");
    }

    @After("within(aopexercise.component.Q5)")
    void q5afterWithinlog()
    {
        System.out.println("Advice run after method using within");
    }

    //args
    @Before("args(Integer)")
    void q5beforeArgslog()
    {
        System.out.println("Advice run before method using args");
    }

    @After("args(Integer)")
    void q5afterArgslog()
    {
        System.out.println("Advice run after method using args");
    }

    //this
    @Before("this(aopexercise.component.Q5)")
    void q5beforeThislog()
    {
        System.out.println("Advice run before method using this!");
    }
    @After("this(aopexercise.component.Q5)")
    void q5afterThislog()
    {
        System.out.println("Advice run after method using this!");
    }

    //bean
    @Before("bean(Q5))")
    void q5beforeBeanlog()
    {
        System.out.println("Advice run before method using bean");
    }
    @After("bean(Q5))")
    void q5afterBeanlog()
    {
        System.out.println("Advice run after method using bean");
    }

    //Question 6
    @Before("executionPointCut()")
    public void q6Log(){

        System.out.println("Advice run using point cut annotation");
    }
    @Pointcut("execution(public void aopexercise.component.Q3.display())")
    public void executionPointCut(){}

    //Question 7
    @Before("args(Integer,String)")
    public void q7log(JoinPoint joinPoint){

        System.out.println("Advice run before method");
        System.out.println("Method signature is "+joinPoint.getSignature());
        System.out.println("Method Arguments are : ");
        Object[] arguments=joinPoint.getArgs();
        for(Object o : arguments)
        {
            System.out.println(o);
        }
    }

}
