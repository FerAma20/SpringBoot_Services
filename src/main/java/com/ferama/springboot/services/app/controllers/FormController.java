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


@RestController
public class FormController {
	
	@Autowired
	IFormServiceImp iFormServiceImp;
	
	@CrossOrigin(origins = "http://localhost:65245")
	@GetMapping("/getAllForms")
	@ResponseStatus(HttpStatus.OK)
	public List<Form> getAllForms() {
		try {
			return iFormServiceImp.readAllForm();
		}catch(Exception ex) {
			return null;
		}
	}
	
	@CrossOrigin(origins = "http://localhost:65245")
	@PostMapping("/createForm")
	@ResponseStatus(HttpStatus.CREATED)
	public boolean createForm(@RequestBody Form form) {
		try {
			iFormServiceImp.createForm(form);
			
			System.out.println(form.address);
			System.out.println(form.firstName);
			System.out.println(form.dateOfBirth);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

}
