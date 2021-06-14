//package com.employee.controller;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.propertyeditors.CustomDateEditor;
//import org.springframework.stereotype.Controller;
//
//import com.employee.dto.CompleteDepAndEduRequest;
//import com.employee.entities.Employee;
//import com.employee.service.CompleteDepAndEduService;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.InitBinder;
//import org.springframework.web.bind.annotation.RequestMapping;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//import org.springframework.beans.propertyeditors.CustomDateEditor;
//import org.springframework.web.bind.WebDataBinder;

//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.employee.entities.Dependants;
//import com.employee.entities.Employee;
//import com.employee.repositories.DependantsRepository;
//import com.employee.repositories.EmployeeRepository;
//import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//public class DependantsController {
//	
//  @Autowired
//  CompleteDepAndEduService completeDep;
//  
//  @InitBinder
//	public void initBinder(WebDataBinder binder) {
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10));
//	}
	
	
	
//		@Autowired
//		private ReservationService reservationService;
//
//
//			@RequestMapping("/saveDeptAndEdu")
//			public String confirmReservation(ReservationRequest request,ModelMap modelMap)             //2)in resercation controller we are not using reqest param .
//			{                                                                        //we are creating data transfer object.
//		    Reservation reservationId= reservationService.bookFlight(request);       //which consist of the field, matching the form.
//			       modelMap.addAttribute("reservationId",reservationId.getId());      //so that all the data from the form should be pick and that stored in the object.
//			     
//			                                                                         //further these object we are suppling it to the servicelayer.
//				return "confirmReservation";                                         //the service layer know as the method book a flight.
				                                                                     //book a flight is an interface[ReservationRequest request]but the method that is
				                                                                     //present in the reservation service impl  class 
			
		
		
		
		
		
		
	
//	
//	@Autowired
//	DependantsRepository depandantRepo;
//	
//	@Autowired
//	EmployeeRepository employeeRepo;
//	
//	@RequestMapping("/addDependants")
//	public String addDependants() {
//		return "addDependants";
//	}
//
//
//	@RequestMapping("/saveDependants")
//	public String saveDependants(@ModelAttribute("dependants") Dependants dependants, ModelMap  modelMap   ) {
//		depandantRepo.save(dependants);
//		List<Employee> employee = employeeRepo.findAll();
//		
//		modelMap.addAttribute("employee", employee);
//		return "addDependants";
//	}
//	
//	@RequestMapping("/displayDependant")
//	public String displayDependant(ModelMap modelMap) {
//		List<Dependants> dependants = depandantRepo.findAll();
//		modelMap.addAttribute("dependants", dependants);
//		return "displayAllDependants";
//	}
//	
//	@RequestMapping("/delDependant")
//	public String delDependant(@RequestParam("id") Long id,ModelMap modelMap  ) {
//		depandantRepo.deleteById(id);
//		List<Dependants> dependants = depandantRepo.findAll();
//		modelMap.addAttribute("dependants", dependants);
//		return "displayAllDependants";
//	}
//	
//	
//	@RequestMapping("/editDependant")
//	public String editDependant(@RequestParam("id") Long id, ModelMap modelMap) {
//	Dependants dependants = depandantRepo.findDependantById(id);
//		modelMap.addAttribute("dependants", dependants);
//		return "updateDependantDetails";
//
//	}
//
//	@RequestMapping("/updateDependant")
//	public String updateLocation(@ModelAttribute("dependants") Dependants dependants, ModelMap modelMap) {
//		depandantRepo.save(dependants);
//
//		modelMap.addAttribute("msg", "Employee details updated successfully");
//		return "updateDependantDetails";
//	}}

	
		
//	}
	
//}
