package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext(
				"org.example/applicationContext.xml");

		SportsPlayer player = (SportsPlayer) context.getBean("footballPlayer");
		player.train();
	}

}
