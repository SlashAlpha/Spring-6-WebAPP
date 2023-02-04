package slash.code.spring6webapp.controllers;

import slash.code.spring6webapp.services.GreetingService;

public class ConstructorInjectedController {
    GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
