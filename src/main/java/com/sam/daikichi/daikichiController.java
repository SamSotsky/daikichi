package com.sam.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class daikichiController {
	
	@RequestMapping("/")
	public String coolRoutes() {
		return "Welcome!";
	}
	
	@RequestMapping("/daikichi/tavel/honolulu")
	public String today() {
		return "Congratulations! You will travel to HoneyLulu";
	}
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
//	PathVariables
	@RequestMapping("/find/{var1}/{var2}")
	public String someVars(@PathVariable("var1") String var1, @PathVariable("var2") String var2) {
		System.out.println(var1 + " : " + var2);
		return "Billy Bob has " + var1 + " " + var2;
	}
	
	@RequestMapping("/daikichi/travel/{akali}")
	public String watermellon(@PathVariable("akali") String akali) {
		return "Congratulations! You will soon travel to " + akali;
	}
	
	@RequestMapping("/daikichi/lotto/{id}")
	public String lotto(@PathVariable("id") int id) {
		if(id % 2 == 0)
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		else
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
	}
}
