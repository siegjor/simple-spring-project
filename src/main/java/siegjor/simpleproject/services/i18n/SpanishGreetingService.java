package siegjor.simpleproject.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import siegjor.simpleproject.services.GreetingService;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola mundo! - ES";
    }
}
