package siegjor.simpleproject.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import siegjor.simpleproject.services.GreetingService;

@Profile("EN")
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world! - EN";
    }
}
