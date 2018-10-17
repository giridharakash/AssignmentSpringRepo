package com.verizon.edb.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.verizon.edb.model.Employee;
import com.verizon.edb.model.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeRepo;
	
	
	@Override
	public Employee getEmployeeById(int empId) {
		Employee employee = null;

		Optional<Employee> optEmployee = employeeRepo.findById(empId);
		if (optEmployee.isPresent()) {
			employee = optEmployee.get();
		}

		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public Employee upadte(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean isDeleted = false;
		if (employeeRepo.existsById(empId)) {
			employeeRepo.deleteById(empId);
			isDeleted=true;
		}
		return isDeleted;
	}

	@Override
	public boolean existsByMobileNumber(String mobileNumber) {
		return employeeRepo.existsByMobileNumber(mobileNumber);
	}

	@Override
	public boolean existsByEmailId(String emailId) {
		return employeeRepo.existsByEmailId(emailId);
	}

	@Override
	public Employee findByMobileNumber(String mobileNumber) {
		return employeeRepo.findByMobileNumber(mobileNumber);
	}

	@Override
	public Employee findByEmailId(String emailId) {
		return employeeRepo.findByEmailId(emailId);
	}

	@Override
	public List<Employee> findAllByDateOfBirth(LocalDate dateOfBirth) {
		return employeeRepo.findAllByDateOfBirth(dateOfBirth);
	}

}
