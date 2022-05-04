package com.huskey.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huskey.pma.dao.ProjectRepository;
import com.huskey.pma.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	//Reference of the ProjectRepository
	@Autowired 
	ProjectRepository proRepo;
	
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		// Empty instance of Project
		Project aProject = new Project();
		model.addAttribute("project", aProject);
		return "new-project";
	}
	// Saving data to the database
	@PostMapping("/save")
	public String createProject(Project project, Model model) {
		proRepo.save(project);
		// Use a redirect to prevent duplicate submissions
		return "redirect:/projects/new";
	}
}
