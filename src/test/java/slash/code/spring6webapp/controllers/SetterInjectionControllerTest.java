package slash.code.spring6webapp.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import slash.code.spring6webapp.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectionControllerTest {
    @Autowired
    SetterInjectionController setterInjectionController;




    @Test
    void sayHello() {
        System.out.println(setterInjectionController.sayHello());
    }
}