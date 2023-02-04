package slash.code.spring6webapp.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hi every one";
    }
}
