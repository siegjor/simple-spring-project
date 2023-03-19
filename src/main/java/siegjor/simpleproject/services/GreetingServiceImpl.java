package siegjor.simpleproject.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello everyone from base service!";
    }
}
