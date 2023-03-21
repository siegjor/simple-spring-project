package siegjor.simpleproject.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServicePrimaryImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from primary greeting service!";
    }
}
