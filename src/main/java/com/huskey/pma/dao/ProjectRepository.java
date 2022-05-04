package com.huskey.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.huskey.pma.entities.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {

	// Think of this repository as a mechanism to access data in the database, refer this as a CRUD repo
	
	
}
