package com.ferama.springboot.services.app.models.service;

public interface IValidateValues {
	
	boolean emailValidate(String email);
	
	boolean phoneValidate(String phoneNumber);

}
