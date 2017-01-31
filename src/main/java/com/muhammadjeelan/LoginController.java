package com.muhammadjeelan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String loginPage(){
		return "login";
	}

	@RequestMapping("/home")
	public String homePage(){
		
		return "home";
	}

	
	@RequestMapping("/profie")
	public String profilePage(){
		
		return "profie";
	}

	
	@RequestMapping("/games")
	public String gamesPage(){
		
		return "games";
	}
	
	@RequestMapping("/feedback")
	public String feedBackPage(){
		
		return "feedback";
	}

}
