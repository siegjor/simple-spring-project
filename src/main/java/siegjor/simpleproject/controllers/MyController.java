package siegjor.simpleproject.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public MyController() {
        System.out.println("Hello from controller constructor!");
    }

    public String sayHello() {
        System.out.println("Hello from method!");
        return "Hello from method response!";
    }
}
