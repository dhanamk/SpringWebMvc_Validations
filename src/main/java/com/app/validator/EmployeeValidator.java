package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.Employee;

@Component
public class EmployeeValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		//support only Employee class objects
		return Employee.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//downcasting
		Employee e=(Employee)target;

		//text input validation
		if(!Pattern.matches("[A-Z]{2,5}", e.getEmpName())) {
			errors.rejectValue("empName", null,"Please Enter Valid name");
		}

		if(!Pattern.matches("[A-Za-z0-9]{4,8}", e.getEmpPwd())) {
			errors.rejectValue("empPwd", null,"Please Enter Valid Password");
		}
		//radio buttons
		//null,empty,spaces (shulod not be)
		if(!StringUtils.hasText(e.getEmpGen())) {
			errors.rejectValue("empGen", null,"Please Choose valid gender");
		}

		//text area
		if(!Pattern.matches("[A-Za-z0-9\\s]{10,250}", e.getEmpAddr())) {
			errors.rejectValue("empAddr", null,"Please Enter Address");
		}

		//null,empty,spaces (shulod not be)
		if(!StringUtils.hasText(e.getEmpCntry())) {
			errors.rejectValue("empCntry", null,"Please select one Country");
		}
		
		//lang-checkbox-List
		if(e.getEmpLangs()==null || e.getEmpLangs().isEmpty()) {
			errors.rejectValue("empLangs", null,"Please choose at least one Language");
			
		}

	}

}
