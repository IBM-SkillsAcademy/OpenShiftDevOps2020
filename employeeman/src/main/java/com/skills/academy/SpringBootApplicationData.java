package com.skills.academy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.skills.academy.entity.Employee;
import com.skills.academy.repository.EmployeeRepository;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootApplicationData implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationData.class, args);
	}

	@Bean
	public Docket swaggerApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.skills.academy.controller")).paths(PathSelectors.any())
				.build()
				.apiInfo(new ApiInfoBuilder().version("1.0").title("Employee Management API Skills Academy OpenShift")
						.description("Employee Management API Skills Academy v1.0").build());
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		repository.save(new Employee("IBM", "Cognos", "Marcu Anton", "Architect", "Smart Cognos"));
		repository.save(new Employee("IBM", "AI", "John DOE", "Specialist", "Deep Learning for FI"));
		repository.save(new Employee("IBM", "Blockchain", "John John", "Manager", "Hyper Ledger for MM"));
		repository.save(new Employee("GOOGLE", "CLOUD", "William Williams", "Architect", "k8s"));
		repository.save(new Employee("AMAZON", "CLOUD", "Terry Carp", "Manager", "EBS"));
		repository.save(new Employee("AMAZON", "CLOUD", "Eugen Sun", "Architect", "AKS"));
		repository.save(new Employee("MICROSOFT", "CLOUD", "Ana Marco", "Manager", "Functions"));
		repository.save(new Employee("MICROSOFT", "CLOUD", "Andreea Spa", "Architect", "Serverless"));

	}

}
