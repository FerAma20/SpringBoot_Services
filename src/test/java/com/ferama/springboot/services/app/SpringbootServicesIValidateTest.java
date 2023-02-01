package com.ferama.springboot.services.app;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ferama.springboot.services.app.models.service.IValidateImp;

@SpringBootTest
public class SpringbootServicesIValidateTest {
	
	@Autowired
	IValidateImp iValidateImp;
	
	@Test
	void mailValidateTest () {
		assertThat(iValidateImp.emailValidate("ferama22@gmail.com")).isTrue();
		
	}

	@Test
	void phoneValidateTest () {
		assertTrue(iValidateImp.phoneValidate("50247487661"));
		assertTrue(iValidateImp.phoneValidate("+5024748-7661"));
		assertTrue(iValidateImp.phoneValidate("+5024748 7661"));
		assertTrue(iValidateImp.phoneValidate("+502 47487661"));
		assertTrue(iValidateImp.phoneValidate("+502 4748-7661"));
		assertTrue(iValidateImp.phoneValidate("+502 4748 7661"));
		assertTrue(iValidateImp.phoneValidate("+502-47487661"));
		assertTrue(iValidateImp.phoneValidate("+502-4748-7661"));
		assertTrue(iValidateImp.phoneValidate("+502-4748 7661"));
	}

}
