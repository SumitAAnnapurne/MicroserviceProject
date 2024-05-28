package sandeepX.annotationBasedConfig;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService{

	@Override
	public void messageService(String message) {
		System.out.println(message);
		
	}

	

}
