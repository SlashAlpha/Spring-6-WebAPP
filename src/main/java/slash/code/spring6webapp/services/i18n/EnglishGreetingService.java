package slash.code.spring6webapp.services.i18n;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import slash.code.spring6webapp.services.GreetingService;

@Profile({"EN","default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String sayGreetings() {
        return "Hello World - EN";
    }
}
