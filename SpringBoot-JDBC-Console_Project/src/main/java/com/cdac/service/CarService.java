package com.cdac.service;

import com.cdac.model.Car;

public interface CarService {

	public void addCar(Car car);

	void modifyCar(int id, String make, String model, double price);

	public void removeCar(int id);

	

}
