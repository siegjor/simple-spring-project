package siegjor.simpleproject.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceSetterInjection implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Setting a greeting!";
    }
}
