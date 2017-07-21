package aopexercise.component;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Q3 {

    public void throwsException() throws IOException {


            System.out.println("Inside the throwsException method of class Q3");
            throw new IOException("dummy exception");

    }


    public void display(){
        System.out.println("Inside display method of class Q3");
    }
}
