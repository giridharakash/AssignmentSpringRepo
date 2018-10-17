package com.verizon.edb.model.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.verizon.edb.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	boolean existsByMobileNumber(String mobileNumber);
	boolean existsByEmailId(String emailId);
	
	Employee findByMobileNumber(String mobileNumber);
	Employee findByEmailId(String emailId);
	
	List<Employee> findAllByDateOfBirth(LocalDate dateOfBirth);
}
