package com.ferama.springboot.services.app.models.service;

import java.util.List;

import com.ferama.springboot.services.app.models.entity.Form;

public interface IFormService {
	
	boolean createForm (Form form);
	List<Form> readAllForm();

}
