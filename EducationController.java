package com.employee.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.employee.entities.EducationQualification;
import com.employee.repositories.EducationQualificationRepository;

@Controller
public class EducationController {

	// The Below Code used to display Education details
		@RequestMapping("/displayEducation")
		public String displayEducation(ModelMap modelMap) {
			List<EducationQualification> education  = educationRepo.findAll();
			modelMap.addAttribute("education", education);
			return "displayAllEducation";
	}
	
	// The Below Code used to delete Education details	
		@RequestMapping("/delEducation")
		public String delEducation(@RequestParam("id") Long id,ModelMap modelMap  ) {
		educationRepo.deleteById(id);
		List<EducationQualification> education = educationRepo.findAll();
			modelMap.addAttribute("education", education);
			return "displayAllEducation";
		}
		
	// The Below 2 Code is responsible to update Education details
		@RequestMapping("/editEducation")
		public String editEducation(@RequestParam("id") Long id, ModelMap modelMap) {
		EducationQualification education = educationRepo.findEducationById(id);
		modelMap.addAttribute("education", education);
			return "updateEducationDetails";

		}
		
		@RequestMapping("/updateEducation")
		public String updateEducation(@ModelAttribute("education") EducationQualification education, ModelMap modelMap) {
			educationRepo.save(education);

			modelMap.addAttribute("msg", "Education details updated successfully");
			return "updateEducationDetails";
		}
	
	
}
