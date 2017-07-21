package aopexercise.component;

import org.springframework.stereotype.Component;

@Component
public class Q1Service {

    public void display()
    {
        System.out.println("Inside service class: display method");
    }

    protected void show()
    {
        System.out.println("Inside service class: show method");
    }

    public int getValue()
    {
        System.out.println("Inside service class : getValue method");
        return 1;
    }
}
