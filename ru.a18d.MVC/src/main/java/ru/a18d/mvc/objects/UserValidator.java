package ru.a18d.mvc.objects;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Path;
import jakarta.validation.Validation;
import jakarta.validation.ValidatorFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.a18d.mvc.MyController;

import java.util.Set;

public class UserValidator implements Validator {
    private static final Logger logger = LoggerFactory.getLogger(MyController.class);

    @Override
    public boolean supports(Class clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        jakarta.validation.Validator validator = factory.getValidator();
        Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);

        constraintViolations.forEach(el -> {
            String val = el.getPropertyPath().toString();
            String val2 = "user." + val;
            errors.rejectValue(val, val2, el.getMessage());
        });
    }

}