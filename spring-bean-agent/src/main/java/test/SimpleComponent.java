package test;

import org.springframework.stereotype.Component;

@Component
public class SimpleComponent {
    public void sayHello() {
        System.out.println("hello");
    }
}
