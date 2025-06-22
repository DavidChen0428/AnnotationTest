package com.project.david.vaild;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = GradeValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface Grade {
	String message() default "分數只能在0到100之間";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
