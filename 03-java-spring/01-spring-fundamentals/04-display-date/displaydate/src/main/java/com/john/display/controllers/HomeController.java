package com.john.display.controllers;

import java.sql.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.SimpleDateFormat;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat time = new SimpleDateFormat("h:m");
		model.addAttribute("var", time.format(new Date(0)));
		return "time.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat dateFor = new SimpleDateFormat("EEEE");
		SimpleDateFormat dateFor0 = new SimpleDateFormat("dd");
		SimpleDateFormat dateFor1 = new SimpleDateFormat("MMMM");
		SimpleDateFormat dateFor2 = new SimpleDateFormat("yyyy");
		
		String day = dateFor.format(new Date(0));
		String date = dateFor0.format(new Date(0));
		String month = dateFor1.format(new Date(0));
		String year = dateFor2.format(new Date(0));
		
		String realDate = day + "/" + date + "/" + month + "/" + year;
		model.addAttribute("dateFormat", realDate);
		return "date.jsp";
	}
}