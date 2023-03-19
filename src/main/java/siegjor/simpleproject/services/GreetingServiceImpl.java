package siegjor.simpleproject.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello everyone from base service!";
    }
}
