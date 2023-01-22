package com.ferama.springboot.services.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferama.springboot.services.app.models.entity.Form;
import com.ferama.springboot.services.app.models.repository.FormRepository;

@Service
public class IFormServiceImp implements IFormService{

	@Autowired
	FormRepository formRepository;
	
	@Override
	public boolean createForm(Form form) {
		try {
			formRepository.save(form);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

	@Override
	public List<Form> readAllForm() {
		try {
			return formRepository.findAll();
		}catch(Exception ex) {
			return null;
		}
	}

}
