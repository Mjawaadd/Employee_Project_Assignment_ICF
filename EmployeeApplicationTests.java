package com.employee;



import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.entities.Employee;
//import com.employee.entities.Employee;
import com.employee.repositories.EmployeeRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeApplicationTests {
	
	@Autowired
	 private EmployeeRepository employeeRepo;

	@Test
	@RequestMapping("/delEmployee")  
	public String delEmployeeTest(@RequestParam("id") Long id, ModelMap modelMap) {
		int employee = employeeRepo.deleteByEmployeeId(id);
		
		modelMap.addAttribute("employee", employee);
		return "displayAllEmployee";
	}
	
	@Test
	@RequestMapping("/displayEmployee") 
	public String displayEmployeeTest(ModelMap modelMap) { 
     	List<Employee> employee = employeeRepo.findAll(); 
     	
     	modelMap.addAttribute("employee", employee);
		return "displayAllEmployee";
}
	
	  @Test
	   
			@RequestMapping("/saveEmployee")
			public String saveEmployee(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
				employeeRepo.save(employee);
				modelMap.addAttribute("msg", "Employee Details save successfully");
				return "loadPage";
			}
	        
	        
	        
	    }
