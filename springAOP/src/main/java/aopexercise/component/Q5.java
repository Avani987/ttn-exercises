package aopexercise.component;

import org.springframework.stereotype.Component;

@Component
public class Q5 {

    public void method1()
    {
        System.out.println("Inside method1 of class Q5 ");
    }

    public void method2(int a)
    {
        System.out.println("Inside method2 of class Q5 with parameter value "+ a);
    }

}
