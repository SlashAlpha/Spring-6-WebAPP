package slash.code.spring6webapp.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {


    @Override
    public String sayGreetings() {
        return "Hey I'm setting a greeting !!!";
    }
}
