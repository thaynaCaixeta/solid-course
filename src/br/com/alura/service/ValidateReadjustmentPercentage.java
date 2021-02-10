package br.com.alura.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.rh.ValidationException;
import br.com.alura.rh.model.Employee;

public class ValidateReadjustmentPercentage implements ReadjustmentValidation{
	
	public void validate(Employee employee, BigDecimal increasedValue) {
		BigDecimal actualSalary = employee.getPersonalData().getSalary();
		BigDecimal readjustmentPercentage = increasedValue.divide(actualSalary, RoundingMode.HALF_UP);
		
		if (readjustmentPercentage.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidationException("The readjusment can not be higher than 40% of the actual salary!");
		}
	}
}
