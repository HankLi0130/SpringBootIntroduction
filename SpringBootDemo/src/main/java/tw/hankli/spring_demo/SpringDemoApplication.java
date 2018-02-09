package tw.hankli.spring_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tw.hankli.spring_demo.service.Microservice1;


@SpringBootApplication

public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);

//				DataSource mySQL = (DataSource) context.getBean("mySQL");
//				mySQL.connect();
//				mySQL.disconnect();

		Microservice1 microservice1 = (Microservice1) context.getBean("myService");
		microservice1.connect();
		microservice1.disconnect();

		microservice1.sayHello("Dennis!!!");
	}
}
