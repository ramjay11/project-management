package com.huskey.pma.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

// Think of this class as a mapping between java and the database
@Entity
public class Project {

	// Entity is a structure for a given project
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long projectId;
	private String name;
	private String stage; // NONSTARTED, COMPLETED, INPROGRESS
	
	private String description;
	
	@OneToMany(mappedBy="theProject")
	private List<Employee> employees;
	
	public Project() {

	}
	
	// Database will do the auto-increment
	public Project(String name, String stage, String description) {
		super();
		this.name = name;
		this.stage = stage;
		this.description = description;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
