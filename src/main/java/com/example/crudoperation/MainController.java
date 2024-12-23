package com.example.crudoperation;

import com.example.crudoperation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	// This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {

	@Autowired
	private UserService userService;

	@PostMapping(path="/add")
//	 Map ONLY POST Requests
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String email) {
		userService.addNewUser(name, email);
		return "Data Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userService.getAllUsers();

	}
}
