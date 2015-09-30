package com.truckdepot.service.validator;

import java.sql.Time;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.truckdepot.common.util.DateUtil;
import com.truckdepot.service.validator.IsTime;

public class IsTimeValidator implements ConstraintValidator<IsTime, String>{

	public void initialize(IsTime paramA) {
		// TODO Auto-generated method stub
		
	}

	public boolean isValid(String paramT,
			ConstraintValidatorContext paramConstraintValidatorContext) {
		Time time = DateUtil.parseTime(paramT);
		return time != null;
	}

}
