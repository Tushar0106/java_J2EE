package com.billing.mgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billing.mgmt.model.Employee;

public interface EmployeeRepository 
	extends JpaRepository<Employee, Integer> {

}
