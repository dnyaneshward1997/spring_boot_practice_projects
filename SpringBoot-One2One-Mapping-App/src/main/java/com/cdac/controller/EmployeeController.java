package com.cdac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.model.Employee;
import com.cdac.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	
	// insert
	@PostMapping(value = "/employee")
	public String addEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
		return "Employee added successfully";
	}

	
	// update
	@PutMapping(value = { "/employee" })
	public String updateEmployee(@RequestBody Employee employee) {
		employeeService.modify(employee);
		return "Employee updated successfully";
	}

	
	// delete
	@DeleteMapping(value = { "/employee" })
	public String deleteEmployee(@RequestParam int id) {
		System.out.println("first delete");
		employeeService.deleteById(id);
		return "Employee deleted successfully";
	}

	
	// delete by id
	@DeleteMapping(value = { "/employee/{id}" })
	public String deleteEmployee1(@PathVariable int id) {
		System.out.println("second delete");
		employeeService.deleteById(id);
		return "Employee deleted successfully";
	}

	
	
	// get by id
	@GetMapping(value = { "/employee/{id}" })
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.selectById(id);
	}

	
	// get all 
	@GetMapping(value = { "/employee" })
	public List<Employee> getAllEmployee() {
		return employeeService.selectAllEmployee();
	}
	
	
	// get all in pages
	@GetMapping("/employeesPage")
	public List<Employee> getAllPaginated (@RequestParam int pageNo, @RequestParam int pageSize) {
		return employeeService.getAlPaginated(pageNo, pageSize);
	
	}
	
	
	// get all in pages and sorted
	@GetMapping("/employeesPageAndSort")
	public List<Employee> getAllPaginatedAndSorted (@RequestParam int pageNo, @RequestParam int pageSize,	@RequestParam String field) {
		return employeeService.getAlPaginatedAndSorted(pageNo, pageSize, field);
	
	}
	
	
	// get by city
	@GetMapping(value = { "/employeesCity" })
	public ResponseEntity<List<Employee>> getEmployeesByCityName(@RequestParam String cityName){
				
		return new ResponseEntity<List<Employee>>(employeeService.findByCityName(cityName),HttpStatus.OK);
		
	}
	
	
	//	get by city
	@GetMapping(value = { "/employeesState" })
	public ResponseEntity<List<Employee>> getEmployeesByStateName(@RequestParam String stateName){
				
		return new ResponseEntity<List<Employee>>(employeeService.findByAddressStateName(stateName),HttpStatus.OK);
		
	}

}
