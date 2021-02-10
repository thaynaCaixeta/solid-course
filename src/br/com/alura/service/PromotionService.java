package br.com.alura.service;

import br.com.alura.rh.ValidationException;
import br.com.alura.rh.model.Employee;
import br.com.alura.rh.model.Role;

public class PromotionService {

	public void promote(Employee employee, boolean goalReached) {
		Role actualRole = employee.getPersonalData().getRole();
		if (actualRole == Role.MANAGER || !goalReached) {
			throw new ValidationException("Managers cannot receive promotions");
		}
		
		Role newRole = actualRole.nextRole();
		employee.promote(newRole);
	}
}
