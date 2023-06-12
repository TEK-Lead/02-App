package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.nt.beans.Student;

@SpringBootApplication
public class BootProj2DepedencyInjectionApplication {

	public static void main(String[] args) {
ApplicationContext ctx=SpringApplication.run(BootProj2DepedencyInjectionApplication.class, args);


	
	 Student st=ctx.getBean("stud",Student.class);
        st.preparation("CTS-Interview");		
  ((ConfigurableApplicationContext)ctx).close();
	}
}










