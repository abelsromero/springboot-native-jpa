package com.example.springboot;

import org.hibernate.dialect.PostgreSQL95Dialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
        PostgreSQL95Dialect postgreSQL95Dialect = new PostgreSQL95Dialect();
        SpringApplication.run(SpringbootApplication.class, args);
	}

}
