package com.cdac.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.model.Department;
import com.cdac.model.Employee;
import com.cdac.response.DepartmentResponse;
import com.cdac.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	
	// insert
	@PostMapping(value = "/department")
	public String addDepartment(@RequestBody Department department) {
		departmentService.save(department);
		return "Department added successfully";
	}

	
	// update
	@PutMapping(value = { "/department" })
	public String updateDepartment(@RequestBody Department department) {
		departmentService.modify(department);
		return "Department updated successfully";
	}

	
	// delete
	@DeleteMapping(value = { "/department" })
	public String deleteDepartment(@RequestParam int id) {
		System.out.println("first delete");
		departmentService.deleteById(id);
		return "Department deleted successfully";
	}

	
	// delete by id
	@DeleteMapping(value = { "/department/{id}" })
	public String deleteDepartment1(@PathVariable int id) {
		System.out.println("second delete");
		departmentService.deleteById(id);
		return "Department deleted successfully";
	}

	
	
	// get by id
	@GetMapping(value = { "/department/{id}" })
	public Department getDepartmentById(@PathVariable int id) {
		return departmentService.selectById(id);
	}
	
	// get all 
		@GetMapping(value = { "/department" })
		public List<Department> getAll() {
			return departmentService.selectAll();
		}

	
	// get all 
	@GetMapping(value = { "/departments" })
	public List<DepartmentResponse> getAllDepartment() {
		
		List<Department> departments = departmentService.selectAll();
		List<DepartmentResponse> list = new ArrayList<>();
		departments.forEach(d ->{
			DepartmentResponse departmentResponse = new DepartmentResponse();
			departmentResponse.setId(d.getId());
			departmentResponse.setDeptName(d.getDepartmentName());
			//departmentResponse.setEmployeeName(d.getEmployeeName());
			list.add(departmentResponse);
		});
		
		return list;
		
//		return departmentService.selectAll();
	}
	
	
	// get all in pages
	@GetMapping("/departmentPage")
	public List<Department> getAllPaginated (@RequestParam int pageNo, @RequestParam int pageSize) {
		return departmentService.getAlPaginated(pageNo, pageSize);
	
	}
	
	
	// get all in pages and sorted
	@GetMapping("/departmentPageAndSort")
	public List<Department> getAllPaginatedAndSorted (@RequestParam int pageNo, @RequestParam int pageSize,	@RequestParam String field) {
		return departmentService.getAlPaginatedAndSorted(pageNo, pageSize, field);
	
	}
	


}
