package com.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EmployeeController {
	@RequestMapping("/")
	public String home() {
		return "Hello";
	}
}
