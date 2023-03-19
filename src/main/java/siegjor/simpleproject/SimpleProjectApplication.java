package siegjor.simpleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import siegjor.simpleproject.controllers.MyController;

@SpringBootApplication
public class SimpleProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SimpleProjectApplication.class, args);
		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In main method");
		System.out.println(controller.sayHello());
	}

}
