package sandeepX.annotationBasedConfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SMSService implements MessageService{

	@Override
	public void messageService(String message) {
		System.out.println(message);
		
	}

}
