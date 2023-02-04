package slash.code.spring6webapp.controllers;

import slash.code.spring6webapp.services.GreetingService;

public class SetterInjectionController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
       return greetingService.sayGreetings();
    }
}
