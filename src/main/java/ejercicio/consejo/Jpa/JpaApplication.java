package ejercicio.consejo.Jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
@ComponentScan(basePackages = "ejercicio.consejo.Jpa")
public class JpaApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

}