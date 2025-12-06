package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

        /*
        The initial request comes to controller
        then controller -> Service , Service layer mostly deals with all the business logic
        Service -> repository , Repository layer deals with most of the DB level things
        Repository implements the JpaRepository interface -> Model file
        Model file is the object mapping to the SQL table sitting in BE


         */
	}

}
