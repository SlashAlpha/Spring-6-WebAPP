package slash.code.spring6webapp.controllers.i18N;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import slash.code.spring6webapp.controllers.Myi18NController;

//@ActiveProfiles("EN") -- default
@SpringBootTest
class Myi18NControllerTestEN {

    @Autowired
    Myi18NController myi18NController;



    @Test
    void sayHello() {

        System.out.println(myi18NController.sayHello());
    }
}