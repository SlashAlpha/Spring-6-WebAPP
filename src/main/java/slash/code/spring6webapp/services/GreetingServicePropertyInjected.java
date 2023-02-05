package slash.code.spring6webapp.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements  GreetingService {

    @Override
    public String sayGreetings() {
        return "friends dont let friend inject by property";
    }
}
