package com.employee.controller;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;

import com.employee.dto.CompleteDepAndEduRequest;
import com.employee.entities.Employee;
import com.employee.service.CompleteDepAndEduService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import com.employee.entities.Dependants;
import com.employee.entities.Employee;
import com.employee.repositories.DependantsRepository;
import com.employee.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	public class DependantsController {
	
 	 @Autowired
 	 CompleteDepAndEduService completeDep;
 
	
	@Autowired
	DependantsRepository depandantRepo;
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	 // The below  code is used to perfrom display opeartion for Education_Qualification	
	@RequestMapping("/displayDependant")
	public String displayDependant(ModelMap modelMap) {
		List<Dependants> dependants = depandantRepo.findAll();
		modelMap.addAttribute("dependants", dependants);
		return "displayAllDependants";
	}
	

	// The below  code is used to perfrom delete opeartion for Education_Qualification
	@RequestMapping("/delDependant")
	public String delDependant(@RequestParam("id") Long id,ModelMap modelMap  ) {
		depandantRepo.deleteById(id);
		List<Dependants> dependants = depandantRepo.findAll();
		modelMap.addAttribute("dependants", dependants);
		return "displayAllDependants";
	}
	
	// The below 2 codes are responsible to perfrom update opeartions for Education_Qualification
	@RequestMapping("/editDependant")
	public String editDependant(@RequestParam("id") Long id, ModelMap modelMap) {
	Dependants dependants = depandantRepo.findDependantById(id);
		modelMap.addAttribute("dependants", dependants);
		return "updateDependantDetails";

	}

	@RequestMapping("/updateDependant")
	public String updateLocation(@ModelAttribute("dependants") Dependants dependants, ModelMap modelMap) {
		depandantRepo.save(dependants);

		modelMap.addAttribute("msg", "Employee details updated successfully");
		return "updateDependantDetails";
	}
}

	
		
//	}
	
//}
