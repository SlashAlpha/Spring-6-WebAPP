package slash.code.spring6webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import slash.code.spring6webapp.services.GreetingService;

@Controller
public class SetterInjectionController {

   // @Qualifier("setterGreetingBean")
    private GreetingService greetingService;

    @Autowired
   // @Qualifier("setterGreetingBean")
    public void setGreetingService(@Qualifier("setterGreetingBean")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
       return greetingService.sayGreetings();
    }
}
