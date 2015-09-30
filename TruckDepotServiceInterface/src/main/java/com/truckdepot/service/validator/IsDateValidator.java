package com.truckdepot.service.validator;

import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.truckdepot.common.util.DateUtil;
import com.truckdepot.service.validator.IsDate;

public class IsDateValidator implements ConstraintValidator<IsDate, String>{

	public void initialize(IsDate paramA) {
		// TODO Auto-generated method stub
		
	}

	public boolean isValid(String paramT,
			ConstraintValidatorContext paramConstraintValidatorContext) {
		Date date = DateUtil.parseDate(paramT);
		return date != null;
	}

}
