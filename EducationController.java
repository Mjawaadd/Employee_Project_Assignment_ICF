//package com.employee.controller;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.propertyeditors.CustomDateEditor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.InitBinder;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import com.employee.entities.EducationQualification;
//import com.employee.repositories.EducationQualificationRepository;
//
//@Controller
//public class EducationController {
//	
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10));
//	}
//	
//	@Autowired
//	EducationQualificationRepository educationRepo;
//
//
//	@RequestMapping("/addEducations")
//	public String addEducations() {
//		return "addEducations";
//
//	}
//	
//	@RequestMapping("/saveEducation")
//	public String saveDependants(@ModelAttribute("education") EducationQualification education, ModelMap  modelMap   ) {
//		educationRepo.save(education);
//		modelMap.addAttribute("msg", "Education Details saved successfully");
//		return "addEducations";
//	}
//	
//		@RequestMapping("/displayEducation")
//		public String displayEducation(ModelMap modelMap) {
//			List<EducationQualification> education  = educationRepo.findAll();
//			modelMap.addAttribute("education", education);
//			return "displayAllEducation";
//	}
//		
//		@RequestMapping("/delEducation")
//		public String delEducation(@RequestParam("id") Long id,ModelMap modelMap  ) {
//			educationRepo.deleteById(id);
//			List<EducationQualification> education = educationRepo.findAll();
//			modelMap.addAttribute("education", education);
//			return "displayAllEducation";
//		}
//		
//		@RequestMapping("/editEducation")
//		public String editEducation(@RequestParam("id") Long id, ModelMap modelMap) {
//		EducationQualification education = educationRepo.findEducationById(id);
//			modelMap.addAttribute("education", education);
//			return "updateEducationDetails";
//
//		}
//		
//		@RequestMapping("/updateEducation")
//		public String updateEducation(@ModelAttribute("education") EducationQualification education, ModelMap modelMap) {
//			educationRepo.save(education);
//
//			modelMap.addAttribute("msg", "Education details updated successfully");
//			return "updateEducationDetails";
//		}
//	
//	
//}
