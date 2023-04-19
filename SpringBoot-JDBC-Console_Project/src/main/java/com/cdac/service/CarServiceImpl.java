package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.CarDao;
import com.cdac.model.Car;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDao carDao;

	@Override
	public void addCar(Car car) {
		carDao.saveCar(car);

	}

	@Override
	public void modifyCar(int id, String make, String model, double price) {
	carDao.updateCar(id, make, model, price);

	}

	@Override
	public void removeCar(int id) {
		carDao.delete(id);

	}

}
