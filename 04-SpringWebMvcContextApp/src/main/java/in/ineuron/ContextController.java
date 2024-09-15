package in.ineuron;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContextController {	
	
	@GetMapping("/view")
	public String dispViewMsg(Model model) {
		String viewMsg="Welcome to iNeuron ai";
		model.addAttribute("view", viewMsg);
		return "index";
	}

}
