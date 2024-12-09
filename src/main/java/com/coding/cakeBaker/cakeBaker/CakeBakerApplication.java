package com.coding.cakeBaker.cakeBaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CakeBakerApplication implements CommandLineRunner {

	@Autowired
	frostingService FC;

	@Autowired
	syrupService SC;

	public static void main(String[] args) {

		SpringApplication.run(CakeBakerApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(FC.bakeCake());
		System.out.println(SC.bakeCake());
	}
}
