package sandeepX.annotationBasedConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
	private MessageService messageService;
	
	@Autowired
	public MessageSender(MessageService messageService) {
		super();
		this.messageService = messageService;
	}
	
	public void sendMessage(String message) {
		this.messageService.messageService(message);
	}
	
	

}
