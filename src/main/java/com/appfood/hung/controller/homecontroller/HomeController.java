package com.appfood.hung.controller.homecontroller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String HomePage() {		
		return "index";
	}
	
	@GetMapping("/about")
	public String AboutPage() {		
		return "about";
	}
	
	@GetMapping("/contact")
	public String Contact() {		
		return "contact";
	}
	
	@GetMapping("/gallery")
	public String Gallery() {		
		return "gallery";
	}
	
	@GetMapping("/menu")
	public String MenuPage() {		
		return "menu";
	}
	
	@GetMapping("/reservation")
	public String ReservationPage() {		
		return "reservation";
	}

	@RequestMapping("login")
	public String login(){
		return "login";
	}

	@RequestMapping("signin")
	public String signin(){
		return "signin";
	}
}
