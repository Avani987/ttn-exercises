package aopexercise.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;

public class AopMain {

    public static void main(String[] args) throws IOException {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("aopspringconfig.xml");

        System.out.print("\n Question 1 \n");
        Q1Service q1=ctx.getBean(Q1Service.class);
        q1.display();
        int i=q1.getValue();
        q1.show();

        System.out.print("\n Question 2 \n");
        Q2 q2=ctx.getBean(Q2.class);
        q2.display();

        System.out.print("\n Question 3 \n");
        Q3 q3=ctx.getBean(Q3.class);
        try {
            q3.throwsException();
        }
        catch (Exception ex){
            System.out.println("Exception "+ex+" caught in main");
        }

        System.out.print("\n Question 4 \n");
        Q4 q4=ctx.getBean(Q4.class);
        q4.deprecatedMethod();

        System.out.print("\n Question 5 \n");
        Q5 q5=ctx.getBean(Q5.class);
        q5.method1();
        q5.method2(5);

        System.out.print("\n Question 6 \n");
        q3.display();

        System.out.print("\n Question 7 \n");
        Q7 q7=ctx.getBean(Q7.class);
        q7.showValues(3,"avani");
    }
}
