package com.example.demo;

import com.example.demo.model.crudStudent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(CrudApplication.class, args);
	}

	public void userSave(crudStudent student) {
	}

	public void findAll() {
	}
}
