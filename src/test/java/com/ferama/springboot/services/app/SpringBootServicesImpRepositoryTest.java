package com.ferama.springboot.services.app;

import com.ferama.springboot.services.app.models.entity.Form;
import com.ferama.springboot.services.app.models.service.IFormServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SpringBootServicesImpRepositoryTest {

    @Autowired
    IFormServiceImp iFormServiceImp;

    Form testForm = new Form("Fernando","Escobar","Guatemala","ferama22@gmail.com","50247487661","Android Avanzado", LocalDate.parse("1997-01-08"));

    @Test
    void testRegisterForm(){
        assertTrue(iFormServiceImp.registerForm(testForm));
    }

    @Test
    void testReadAllForm(){
        assertEquals(11,iFormServiceImp.readAllForm().size());
    }
}
