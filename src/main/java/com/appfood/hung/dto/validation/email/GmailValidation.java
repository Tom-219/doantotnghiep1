package com.appfood.hung.dto.validation.email;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GmailValidation implements ConstraintValidator<GmailAnotation, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.endsWith("@gmail.com");
    }
}
