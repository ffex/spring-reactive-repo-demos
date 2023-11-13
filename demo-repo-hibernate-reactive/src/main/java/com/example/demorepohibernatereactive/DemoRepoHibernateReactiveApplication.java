package com.example.demorepohibernatereactive;

import jakarta.persistence.Persistence;
import org.hibernate.reactive.mutiny.Mutiny;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoRepoHibernateReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRepoHibernateReactiveApplication.class, args);
	}

	@Bean
	public Mutiny.SessionFactory sessionFactory() {
		return Persistence.createEntityManagerFactory("aziendaTest")
				.unwrap(Mutiny.SessionFactory.class);
	}


}
