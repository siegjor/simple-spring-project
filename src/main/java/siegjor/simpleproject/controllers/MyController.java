package siegjor.simpleproject.controllers;

import org.springframework.stereotype.Controller;
import siegjor.simpleproject.services.GreetingService;
import siegjor.simpleproject.services.GreetingServiceImpl;

@Controller
public class MyController {

    private final GreetingService greetingService;
    public MyController() {
        this.greetingService = new GreetingServiceImpl();
        System.out.println("Hello from controller constructor!");
    }

    public String sayHello() {
        System.out.println("In the controller!");
        return greetingService.sayGreeting();
    }
}
