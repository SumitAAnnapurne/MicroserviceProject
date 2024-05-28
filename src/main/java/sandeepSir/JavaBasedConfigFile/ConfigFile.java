package sandeepSir.JavaBasedConfigFile;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration

public class ConfigFile {
	
	//we can give any name to the bean and we can access the bean with the name
	@Bean
	@Primary
	 Student stdId() {
		Student student = new Student();
		
		student.setId(1);
		student.setStdAddress("sonpeth");
		student.setStdName("sumit");
				
		return student;
	}
	
	@Bean
		Student stdName() {
		Student st = new Student();
		st.setId(2);
		st.setStdAddress("parli");
		st.setStdName("karan");
		
		return st;
	}
	

}
