package siegjor.simpleproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import siegjor.simpleproject.services.GreetingService;

@Controller
public class PropertyInjectedController {
    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
