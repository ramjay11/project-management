package com.huskey.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.huskey.pma.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
