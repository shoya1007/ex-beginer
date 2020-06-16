package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.ServletContext;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/result")
	public String result(Integer item1,Integer item2,Integer item3) {
		Integer price = item1 + item2 + item3;
		Integer totalPrice = (int) (price*1.1);
		application.setAttribute("price", price);
		application.setAttribute("totalPrice", totalPrice);
		return "exam03-result";
	}
}
