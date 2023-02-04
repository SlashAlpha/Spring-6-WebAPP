package slash.code.spring6webapp.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import slash.code.spring6webapp.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
    PropertyInjectedController propertyInjectedController;



    @BeforeEach
    void setUp() {
        propertyInjectedController=new PropertyInjectedController();
        propertyInjectedController.greetingService=new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}