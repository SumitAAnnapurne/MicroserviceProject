package sandeepX.annotationBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		String message = "solve the tough problems";
	ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
	
		MessageSender ms = ap.getBean(MessageSender.class);
		ms.sendMessage(message);
	}

}
