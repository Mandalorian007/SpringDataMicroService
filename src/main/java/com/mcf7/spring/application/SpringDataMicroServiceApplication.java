package com.mcf7.spring.application;

import com.mcf7.spring.config.RestValidationConfiguration;
import com.mcf7.spring.domain.Book;
import com.mcf7.spring.domain.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackageClasses = {BookRepository.class, RestValidationConfiguration.class})
@EntityScan(basePackageClasses = {Book.class})
@EnableJpaRepositories(basePackageClasses = {BookRepository.class})
public class SpringDataMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataMicroServiceApplication.class, args);
	}
}
