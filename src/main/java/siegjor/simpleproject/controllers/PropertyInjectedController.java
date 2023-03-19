package siegjor.simpleproject.controllers;

import siegjor.simpleproject.services.GreetingService;

// Very bad way of doing DI, don't do that!!
public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
