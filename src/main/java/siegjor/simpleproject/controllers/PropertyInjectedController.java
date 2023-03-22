package siegjor.simpleproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import siegjor.simpleproject.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyGreetingService")
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
