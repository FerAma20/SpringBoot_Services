package com.ferama.springboot.services.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.ferama.springboot.services.app.models.entity.Form;
import com.ferama.springboot.services.app.models.service.IFormServiceImp;


@RestController
@RequestMapping("api/Forms")
public class FormController {
	
	@Autowired
	IFormServiceImp iFormServiceImp;

	@GetMapping("/getAllForms")
	@ResponseStatus(HttpStatus.OK)
	public List<Form> getAllForms() {
			return iFormServiceImp.readAllForm();
	}

	@PostMapping("/registerForm")
	@ResponseStatus(HttpStatus.CREATED)
	public boolean registerForm(@RequestBody Form form) {
			return iFormServiceImp.registerForm(form);
	}

}
