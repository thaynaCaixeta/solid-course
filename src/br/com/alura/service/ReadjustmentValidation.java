package br.com.alura.service;

import java.math.BigDecimal;

import br.com.alura.rh.model.Employee;

public interface ReadjustmentValidation {
	
	void validate(Employee employee, BigDecimal increasedValue);

}
