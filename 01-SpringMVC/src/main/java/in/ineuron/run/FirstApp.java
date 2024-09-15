package in.ineuron.run;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FirstApp {
	
	@RequestMapping("/welcome")
	public ModelAndView displayMsg() {
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "Welcome to Our Spring MVC web App");
		mv.setViewName("index");
		return mv;
		
	}
	
	@GetMapping("/first")
	public String disp(Model model) {
		System.out.println("first coming");
		model.addAttribute("msg","first app page");
		return "index";
	}

}
