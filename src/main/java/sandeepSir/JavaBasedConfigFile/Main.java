package sandeepSir.JavaBasedConfigFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ap = new AnnotationConfigApplicationContext(ConfigFile.class);
//		Student std = (Student)ap.getBean("stdId");
//		std.Display();
		
		Student std=  ap.getBean(Student.class);
		std.Display();
	}

}
