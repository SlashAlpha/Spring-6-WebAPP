package slash.code.spring6webapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import slash.code.spring6webapp.controllers.AuthorController;

@SpringBootTest
class Spring6WebappApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    AuthorController controller;

    @Test
    void testAutowireOfController() {
        controller.equals(applicationContext.getBean(AuthorController.class));
        System.out.println(controller.sayHi());
    }

    @Test
    void getControllerFromContext() {
        AuthorController controller=applicationContext.getBean(AuthorController.class);
        System.out.println( controller.sayHi());
    }

    @Test
    void contextLoads() {
    }

}
