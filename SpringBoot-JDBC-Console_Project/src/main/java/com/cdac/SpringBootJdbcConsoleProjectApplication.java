package com.cdac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cdac.model.Car;
import com.cdac.service.CarService;

@SpringBootApplication
public class SpringBootJdbcConsoleProjectApplication implements CommandLineRunner{

	@Autowired
	private CarService carService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcConsoleProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Car car = new Car();
		car.setId(55);
		car.setMake("Mahindra");
		car.setModel("Thar");
		car.setPrice(20000);
		
		carService.addCar(car);
		System.out.println("Car added successfully");
		
		//carService.modifyCar(100, "Tata", "Punch", 2000);
		//System.out.println("Car updated successfully");
		
		//carService.removeCar(10);
		//System.out.println("Car removed successfully");
	}

}
