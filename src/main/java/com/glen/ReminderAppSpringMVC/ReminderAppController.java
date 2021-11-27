package com.glen.ReminderAppSpringMVC;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.glen.ReminderAppSpringMVC.models.Reminder;

@Controller
public class ReminderAppController {
	private List<Reminder> reminders = new ArrayList<>();
	
	@RequestMapping(path="/", method = RequestMethod.GET)
	public String getReminders(Model model) {
		model.addAttribute("reminders",reminders);
		return "index";
	}
	
	@RequestMapping(path="/", method = RequestMethod.POST)
	public String addReminder(@ModelAttribute Reminder reminder) {
		reminders.add(reminder);
		return "redirect:/";
	}
	
	@RequestMapping(value="/deleteReminder/{id}", method = RequestMethod.GET)
	public String deleteReminder(@PathVariable("id")int id) {
		for(int i=0;i<reminders.size();i++)
			if(reminders.get(i).getId()==id)
				reminders.remove(i);
		return "redirect:/";
	}
	
}
