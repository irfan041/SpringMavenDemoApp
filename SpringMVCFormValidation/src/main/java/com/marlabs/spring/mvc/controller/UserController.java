package com.marlabs.spring.mvc.controller;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.marlabs.spring.mvc.model.User;
import com.marlabs.spring.mvc.validator.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserValidator userValidator;
	private static final Logger logger = Logger.getLogger(UserController.class);

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(userValidator);
	}

	@GetMapping("/user")
	public String userForm(Locale locale, Model model) {
		String responsePage = "";
		final String METHOD_NAME = "userForm";
		logger.info("Method Invoked:" + METHOD_NAME);
		model.addAttribute("user", new User());
		responsePage = "userForm";
		logger.info("Response From The Method:" + METHOD_NAME + ":"
				+ responsePage);
		return responsePage;
	}

	/*
	 * Save user object
	 */
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") @Validated User user,
			BindingResult result, Model model) {

		String responsePage = "";
		final String METHOD_NAME = "saveUser";
		logger.info("Method Invoked:" + METHOD_NAME + ":" + user);
		// UserValidator userValidator = new UserValidator();
		// userValidator.validate(user, result);
		if (result.hasErrors()) {
			responsePage = "userForm";

		} else {
			responsePage = "success";
		}

		logger.info("Response From The Method:" + METHOD_NAME + ":"
				+ responsePage);
		return responsePage;
	}
}
