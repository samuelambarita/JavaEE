package del.ac.id.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import del.ac.id.demo.jpa.User;

public class IndexController {
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("user", new User());
		return mv;
	}
}
