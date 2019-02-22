package com.mul.mappet;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mul.mappet.service.PlaceService;

@Controller
@RequestMapping(value="/trip")
public class TripController {
	@Autowired
	private PlaceService placeService;
	
	@RequestMapping(value="/a")
	public String test(Model model) {
		Date test = placeService.test();
		model.addAttribute("test", test);
		return "trip/main";
	}
}
