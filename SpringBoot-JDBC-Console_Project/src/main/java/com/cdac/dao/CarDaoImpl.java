package com.cdac.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.model.Car;

@Repository
public class CarDaoImpl implements CarDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// insert data
	@Override
	public void saveCar(Car car) {

		String insertQuery = "insert into Table_Car7 (id, make, model, price) values (?,?,?,?)";
		Object[] carArray = { car.getId(), car.getMake(), car.getModel(), car.getPrice() };

		jdbcTemplate.update(insertQuery, carArray);
	}

	// update data
	@Override
	public void updateCar(int id, String make, String model, double price) {

		String updateQuery = "update Table_Car7 set make = ?, model = ?, price = ? where id = ?";
		Object[] carArray = { make, model, price, id };
		jdbcTemplate.update(updateQuery, carArray);

	}

	// delete data
	@Override
	public void delete(int id) {

		String deleteQuery = "delete from Table_Car7 where id = ?";
		jdbcTemplate.update(deleteQuery, id);

	}

}
