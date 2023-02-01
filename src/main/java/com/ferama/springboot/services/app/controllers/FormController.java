package com.ferama.springboot.services.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ferama.springboot.services.app.models.entity.Form;
import com.ferama.springboot.services.app.models.service.IFormServiceImp;
import com.ferama.springboot.services.app.models.service.IValidateImp;


@RestController
public class FormController {
	
	@Autowired
	IFormServiceImp iFormServiceImp;
	@Autowired
	IValidateImp iValidateImp;
	
	@CrossOrigin(origins = "http://localhost:65245")
	@GetMapping("/getAllForms")
	@ResponseStatus(HttpStatus.OK)
	public List<Form> getAllForms() {
			return iFormServiceImp.readAllForm();
	}
	
	@CrossOrigin(origins = "http://localhost:65245")
	@PostMapping("/registerForm")
	@ResponseStatus(HttpStatus.CREATED)
	public boolean createForm(@RequestBody Form form) {
			if(!iValidateImp.emailValidate(form.email)) return false;
			if(!iValidateImp.phoneValidate(form.phoneNumber)) return false;
			return iFormServiceImp.createForm(form);	
	}

}
