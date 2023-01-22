package com.ferama.springboot.services.app.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferama.springboot.services.app.models.entity.Form;

public interface FormRepository extends JpaRepository<Form, Long>{

}
