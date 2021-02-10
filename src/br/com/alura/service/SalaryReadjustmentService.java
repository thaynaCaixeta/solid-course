package br.com.alura.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Employee;

public class SalaryReadjustmentService {
	
	private List<ReadjustmentValidation> validations;

	
	public SalaryReadjustmentService(List<ReadjustmentValidation> validations) {
		this.validations = validations;
	}

	public void salaryReadjustment(Employee employee, BigDecimal increasedValue) {
		this.validations.forEach(v -> v.validate(employee, increasedValue));
		BigDecimal newSalary = employee.getPersonalData().getSalary().add(increasedValue);
		employee.adjustSalary(newSalary);
	}
}
