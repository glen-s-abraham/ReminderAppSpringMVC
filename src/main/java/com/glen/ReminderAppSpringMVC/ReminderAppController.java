package com.glen.ReminderAppSpringMVC;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReminderAppController {

	@RequestMapping("/")
	public String getReminders() {
		System.out.println("Controller hit");
		return "index";
	}
}
