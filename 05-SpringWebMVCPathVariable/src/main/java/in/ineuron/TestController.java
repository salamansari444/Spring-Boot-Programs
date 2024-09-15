package in.ineuron;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TestController {
		
		@GetMapping("/book/{bname}/{authorname}")
		public String getBookDetails(@PathVariable("bname") String bname,@PathVariable("authorname") String authorname, Model model) {
			String msg=authorname+ " is author of "+bname+" Which is famous";
			model.addAttribute("book",msg);
			return "index";
		}
}
