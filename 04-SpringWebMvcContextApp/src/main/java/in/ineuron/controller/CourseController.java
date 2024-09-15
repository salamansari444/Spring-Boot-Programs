package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {
	
	@GetMapping("/course")
	public String getCourse(Model model) {
		model.addAttribute("cid", "54");
		model.addAttribute("cName", "java");
		model.addAttribute("price", "17000 INR");
		return "course";
	}
}
