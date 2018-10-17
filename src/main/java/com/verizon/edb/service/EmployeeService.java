package com.verizon.edb.service;

import java.time.LocalDate;
import java.util.List;
import com.verizon.edb.model.Employee;

public interface EmployeeService {
	Employee getEmployeeById(int empId);
	List<Employee> getAllEmployees();
	Employee addEmployee(Employee employee);
	Employee upadte(Employee employee);
	boolean deleteEmployee(int empId);
	
	boolean existsByMobileNumber(String mobileNumber);
	boolean existsByEmailId(String emailId);
	
	Employee findByMobileNumber(String mobileNumber);
	Employee findByEmailId(String emailId);
	
	List<Employee> findAllByDateOfBirth(LocalDate dateOfBirth);
}
