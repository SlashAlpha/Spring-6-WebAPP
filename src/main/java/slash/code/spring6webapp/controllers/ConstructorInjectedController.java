package slash.code.spring6webapp.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import slash.code.spring6webapp.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
