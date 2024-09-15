package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ineuron.binding.Books;

@Controller
public class BooksController {
	
	@GetMapping("/loading")
	public String loadingform() {
//		m.addAttribute("book", "Loading form");
		return "index";	
	}
	
	@PostMapping("/save")
	public String afterSubmission(Books book, Model m) {
		m.addAttribute("book",book);
		return "books";
	}

}
