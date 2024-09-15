package in.ineuron.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome to Spring</h1>");
	}
	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome to Spring User</h1>");
	}
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome to Spring Admin</h1>");
	}
	

}
