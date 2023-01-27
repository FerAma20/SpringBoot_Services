package com.ferama.springboot.services.app;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ferama.springboot.services.app.models.entity.Form;
import com.ferama.springboot.services.app.models.service.IFormServiceImp;

@SpringBootTest
public class SpringbootServicesJUnitTests {
	
	@Autowired
	IFormServiceImp iFormServiceImp;
	
	Form testForm = new Form("Fernando", "Escobar", "Guatemala", "ferama22@gmail.com", "47487661", "Android Avanzado", "08-01-1997");
	
	@Test
	void testCreateForm() {
		assertTrue(iFormServiceImp.createForm(testForm));
	}
	
	@Test
	void testReadAllForm() {
		List<Form> list = new ArrayList<Form>();
		list.add(testForm);
		assertThat(list.equals(iFormServiceImp.readAllForm())).isFalse();
	}

}
