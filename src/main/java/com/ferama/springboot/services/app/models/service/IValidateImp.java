package com.ferama.springboot.services.app.models.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

@Service
public class IValidateImp implements IValidateValues{
	
	
	
	@Override
	public boolean emailValidate(String email) {
		Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher mather = pattern.matcher(email);
		if(mather.find()) return true;
		return false;
	}
	
	@Override
	public boolean phoneValidate(String phoneNumber) {
		Pattern pattern = Pattern
                .compile("^*+502[- ]?\\d{4}[- ]?\\d{4}$");
		Matcher mather = pattern.matcher(phoneNumber);
		if(mather.find()) return true;
		return false;
	}

}
