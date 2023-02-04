package slash.code.spring6webapp.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import slash.code.spring6webapp.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionControllerTest {
    SetterInjectionController setterInjectionController;

    @BeforeEach
    void setUp() {
 setterInjectionController=new SetterInjectionController();
        setterInjectionController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(setterInjectionController.sayHello());
    }
}