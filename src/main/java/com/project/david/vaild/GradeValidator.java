package com.project.david.vaild;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GradeValidator implements ConstraintValidator<Grade, Integer> {

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		return value != null && value <= 100 && value >= 0;
	}

}
