package slash.code.spring6webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import slash.code.spring6webapp.controllers.AuthorController;

@SpringBootApplication
public class Spring6WebappApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(Spring6WebappApplication.class, args);
		AuthorController controller=ctx.getBean(AuthorController.class);

		System.out.println(controller.sayHi());
	}

}
