package slash.code.spring6webapp.controllers;

import org.junit.jupiter.api.Test;
import slash.code.spring6webapp.services.AuthorService;

import static org.junit.jupiter.api.Assertions.*;

class AuthorControllerTest {

    AuthorService service;

    @Test
    void sayHi() {

        AuthorController controller=new AuthorController(service);
        System.out.println(controller.sayHi());
    }
}