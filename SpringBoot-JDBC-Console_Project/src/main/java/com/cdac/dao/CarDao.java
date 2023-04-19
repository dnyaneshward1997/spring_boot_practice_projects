package com.cdac.dao;

import com.cdac.model.Car;

public interface CarDao {
	
	public void saveCar(Car car);
	
	void updateCar(int id, String make, String model, double price);
	
	public void delete (int id);

	

}
