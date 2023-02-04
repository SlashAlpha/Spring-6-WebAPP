package slash.code.spring6webapp.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import slash.code.spring6webapp.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
         controller=new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}