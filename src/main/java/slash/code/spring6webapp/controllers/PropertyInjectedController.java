package slash.code.spring6webapp.controllers;

import slash.code.spring6webapp.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
