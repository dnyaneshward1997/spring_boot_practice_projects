package com.cdac.response;

public class DepartmentResponse {
	
	private int id;
	private String deptName;
	private String employeeName;
	
	public DepartmentResponse() {
;
	}
	
	public DepartmentResponse(int id, String deptName, String employeeName) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.employeeName = employeeName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "DepartmentResponse [id=" + id + ", deptName=" + deptName + ", employeeName=" + employeeName + "]";
	}
	
	

}
