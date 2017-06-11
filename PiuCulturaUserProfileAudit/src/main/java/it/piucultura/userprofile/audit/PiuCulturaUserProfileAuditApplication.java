package it.piucultura.userprofile.audit;

import it.piucultura.userprofile.audit.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.HashMap;

@SpringBootApplication
public class PiuCulturaUserProfileAuditApplication {


	public static HashMap<Long,User> hmUser;

	public static void main(String[] args) {


		hmUser=new HashMap<Long,User>();

		User one=new User("Francesca","math");
		hmUser.put(new Long(one.getId()),one);
// --
		SpringApplication.run(PiuCulturaUserProfileAuditApplication.class, args);
// --
		User two=new User("Berni","Philosophy");
		hmUser.put(new Long(two.getId()), two);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}
}
