package aopexercise.component;

import org.springframework.stereotype.Component;

@Component
public class Q4 {

    @Deprecated
    public void deprecatedMethod()
    {
        System.out.println("Inside deprecated method of class Q4");
    }

}
