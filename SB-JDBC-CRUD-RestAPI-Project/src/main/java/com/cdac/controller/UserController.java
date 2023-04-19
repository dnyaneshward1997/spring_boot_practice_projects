package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/insert")
	public String addUser() {
		jdbcTemplate.execute("insert into user_table (id, name, email) values(225,'Dinesh', 'dinu@gmail.com')");
		return "data inserted Successfully";
	}

	@RequestMapping("/update")
	public String updateUser() {
		jdbcTemplate.execute("update user_table set name = 'Suresh', email = 'suresh@gmail.com' where id = 155");
		return "data Updated Successfully";
	}

	@RequestMapping("/delete")
	public String deleteUser() {
		jdbcTemplate.execute("delete from user_table where id = 155");
		return "data deleted Successfully";
	}

	@RequestMapping("/select")
	public String selectUserer() {
		jdbcTemplate.execute("select * from user_table where id = 255");
		return "data recived Successfully";
	}

	@RequestMapping("/select_All")
	public String select_All_Users() {
		jdbcTemplate.execute("select * from user_table");
		return "data recived Successfully";
	}
}
