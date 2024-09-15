package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {
	@RequestMapping("/welcome")
	public ModelAndView dispMsg() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "Second App is started");
		mv.setViewName("index");
		return mv;
		
	}
}
