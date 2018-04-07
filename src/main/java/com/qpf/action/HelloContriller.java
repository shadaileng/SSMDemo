package com.qpf.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContriller {
	
	@RequestMapping("/redirect")
	public String redirect() {
		System.out.println("Success");
		return "success";
	}
}
