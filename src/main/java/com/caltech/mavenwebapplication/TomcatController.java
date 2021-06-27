package com.caltech.mavenwebapplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class TomcatController {

		@RequestMapping(method = RequestMethod.GET)
		public String home(ModelMap model) {

			model.addAttribute("name", "This is homepage!");
			return "home";
		}
	}
