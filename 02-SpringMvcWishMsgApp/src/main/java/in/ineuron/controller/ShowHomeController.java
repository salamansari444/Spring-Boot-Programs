package in.ineuron.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import in.ineuron.service.IWishMsgService;

@Controller
public class ShowHomeController {
	@Autowired
	private IWishMsgService service;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showHomePage() {
		System.out.println("coming hereree");
		return "home";
	}

//	@RequestMapping("/wish")
//	public ModelAndView showMsg() {
//		
//		String msg=service.getWishMsg();
//		ModelAndView mav=new ModelAndView();
//		mav.addObject("msg",msg);
//		mav.setViewName("display");
//		return mav;
//	}
	
//	@RequestMapping("/wish")
//	public String showMsg(Model model) {
//		String msg=service.getWishMsg();
//		model.addAttribute("msg", msg);
//		return "display";
//	}
	
//	@RequestMapping("/wish")
//	public String showMsg(Map<String, Object> model) {
//		String msg=service.getWishMsg();
//		model.put("msg", msg);
//		return "display";
//	}
	
	@RequestMapping("/wish")
	public void showMsg(Map<String, Object> model) {
		String msg=service.getWishMsg();
		model.put("msg", msg);
		
	}
}
