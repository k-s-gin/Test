package org.krn;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestMain{
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("msg","Hello!THymleaf!!");
				
		return "indes";
	}
	
}