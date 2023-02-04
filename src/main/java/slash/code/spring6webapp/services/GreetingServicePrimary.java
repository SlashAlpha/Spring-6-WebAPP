package slash.code.spring6webapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService {
    @Override
    public String sayGreetings() {
        return "hello from primary beans";
    }
}
