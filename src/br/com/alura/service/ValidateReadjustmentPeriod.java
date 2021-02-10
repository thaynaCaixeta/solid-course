package br.com.alura.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

import br.com.alura.rh.ValidationException;
import br.com.alura.rh.model.Employee;

public class ValidateReadjustmentPeriod implements ReadjustmentValidation{
	
	public void validate(Employee employee, BigDecimal increasedValue) {
		LocalDate lastReadjustmentDate = employee.getLastReadjustmentDate();
		LocalDate now = LocalDate.now();
		int monthsBetweenLastReadjustment = Period.between(lastReadjustmentDate, now).getMonths();
		
		if (monthsBetweenLastReadjustment < 6) {
			throw new ValidationException("Period between the last readjustment and today are smaller than six months");
		}
	}
}
