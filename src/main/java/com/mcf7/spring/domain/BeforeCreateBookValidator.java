package com.mcf7.spring.domain;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


public class BeforeCreateBookValidator implements Validator{
    public boolean supports(Class<?> clazz) {
        return Book.class.equals(clazz);
    }

    public void validate(Object target, Errors errors) {
        errors.reject("DIE");
    }
}
