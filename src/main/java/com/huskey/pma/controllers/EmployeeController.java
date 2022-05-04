package com.huskey.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huskey.pma.dao.EmployeeRepository;
import com.huskey.pma.dao.ProjectRepository;
import com.huskey.pma.entities.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired 
	EmployeeRepository empRepo;
	
	@GetMapping("/new")
	public String displayEmployeeForm(Model model) {
		// Empty instance of Project
		Employee anEmployee = new Employee();
		model.addAttribute("employee", anEmployee);
		return "new-employee";
	}
	
	@PostMapping("/save")
	public String createEmployee(Model model, Employee employee) {
		// Save to the database using an employee crud repository
		empRepo.save(employee);
		return "redirect:/employees/new";
		 
		
	}
}
