package br.com.alura.service;

import br.com.alura.rh.ValidationException;
import br.com.alura.rh.model.Employee;
import br.com.alura.rh.model.Role;

public class PromotionService {
	
	public void promote(Employee employee, boolean goalReached) {
		Role actualRole = employee.getPersonalData().getRole();
		if (actualRole == Role.MANAGER) {
			throw new ValidationException("Managers cannot receive promotions");
		}
		if (goalReached) {
			Role newRole = actualRole.nextRole();
			employee.promote(newRole);
		} else {
			throw new ValidationException("Goal not reached. Promotion not allowed");
		}
	}

}
