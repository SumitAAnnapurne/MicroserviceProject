package sandeepSir.ConfigBasedFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ap = new AnnotationConfigApplicationContext(Student.class);
	  	Student st =  (Student)ap.getBean("student");
	  	st.Display();
	}

}
