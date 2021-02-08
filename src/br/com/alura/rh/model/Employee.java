package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

	private PersonalData personalData;
	private LocalDate lastReadjustmentDate;

	public PersonalData getPersonalData() {
		return personalData;
	}

	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}

	public LocalDate getLastReadjustmentDate() {
		return lastReadjustmentDate;
	}

	public void setLastReadjustmentDate(LocalDate dataUltimoReajuste) {
		this.lastReadjustmentDate = dataUltimoReajuste;
	}

	public void adjustSalary(BigDecimal newSalary) {
		this.personalData.setSalary(newSalary);
		this.setLastReadjustmentDate(LocalDate.now());
	}
	
	public void promote(Role newRole) {
		this.personalData.setRole(newRole);
	}
}
