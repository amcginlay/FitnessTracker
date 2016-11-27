package com.cynaptec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cynaptec.model.Exercise;

@Controller
public class MinutesController {
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		
		System.out.println("exercise: " + exercise.getMinutes());
		
		return "addMinutes";
//		return "forward:addMoreMinutes.html"; // <-- such calls must be .html as we have external context on request
//		return "redirect:addMoreMinutes.html"; // <-- minutes will get zeroed because redirect is a NEW request
	}

//	@RequestMapping(value="/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
//		
//		System.out.println("exercising: " + exercise.getMinutes());
//		
//		return "addMinutes";
//	}

}
