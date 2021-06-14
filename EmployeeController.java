package com.employee.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.employee.dto.CompleteDepAndEduRequest;
import com.employee.entities.Employee;
import com.employee.repositories.EmployeeRepository;
import com.employee.service.CompleteDepAndEduService;




@Controller
public class EmployeeController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10));
	}
	
// @Autowired is used to create dependant object, here CompleteDepAndEduService is a ServiceLayer and EmployeeRepository is a Repository
  @Autowired
  CompleteDepAndEduService completeDep;

	@Autowired
	EmployeeRepository employeeRepo;
	
//The Below code is used to load the page which consist of the employee details
	@RequestMapping("/loadPage")
	public String loadPage() {
		return "loadPage";

	}
	
//The Below Code is responsible to save the data into the database
	@RequestMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
		employeeRepo.save(employee);
		modelMap.addAttribute("msg", "Employee Details save successfully");
		return "loadPage";
	}
	

//The Below code is responsible to fetch the details from the DB and display it into the webpage
	@RequestMapping("/displayEmployee") 
	public String displayEmployee(ModelMap modelMap) { 
     	List<Employee> employee = employeeRepo.findAll(); 
     	
     	modelMap.addAttribute("employee", employee);
		return "displayAllEmployee";
}
	
// addDetails is a "form action" in jsp page responsible to save details when form is submitted
	@RequestMapping("/addDetails")
	public String addDetails(@RequestParam("id") Long id,ModelMap modelMap) {
		
     	Employee employee = employeeRepo.findEmployeeById(id);
    
		modelMap.addAttribute("employee", employee);

		return "addDepAndEdu";
	}

		
//This method is used to perform delete operation
	@RequestMapping("/delEmployee")  
	public String delMovies(@RequestParam("id") Long id, ModelMap modelMap) {
		int employee = employeeRepo.deleteByEmployeeId(id);
		
		modelMap.addAttribute("employee", employee);
		return "displayAllEmployee";
	}

	
//The below two method codes performs update operations for the employee it is used in conjuction with the @RequestMapping("/updateEmployee") 
// updateEmployeeDetails is a jsp page
	@RequestMapping("/editEmployee")                                                 
	public String editEmployee(@RequestParam("id") Long id, ModelMap modelMap) {
		Employee employee = employeeRepo.findEmployeeById(id);
		modelMap.addAttribute("employee", employee);
		return "updateEmployeeDetails"; 			

	}
	


	@RequestMapping("/updateEmployee")
	public String updateLocation(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
		employeeRepo.save(employee);
		modelMap.addAttribute("msg", "Employee details updated successfully");
		return "updateEmployeeDetails";
	}
	
//The Below code is responsible to save the contents into two different database i.e Dependants and Education_Qualification
//CompleteDepAndEduRequest is a DTO class which inturn calls to the service layer to save the details.
	@RequestMapping("/saveDepAndEdu")
	public String  saveDepAndEdu(CompleteDepAndEduRequest request,ModelMap modelMap) {
		Employee saveDepAndEdu = completeDep.saveDepAndEdu(request);
		modelMap.addAttribute("msg",saveDepAndEdu );
		return "savedDetails";
	}
	
	
	
	
}
	
	
	



