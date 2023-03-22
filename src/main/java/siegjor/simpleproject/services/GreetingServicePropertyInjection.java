package siegjor.simpleproject.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjection implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Friends don't let friends do property injection!";
    }
}
