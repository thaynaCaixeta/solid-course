package br.com.alura.rh.model;

import java.math.BigDecimal;

public class PersonalData {

	private String name;
	private String idDocument;
	private Role role;
	private BigDecimal salary;
	
	public PersonalData(String name, String idDocument, Role role, BigDecimal salary) {
		this.name = name;
		this.idDocument = idDocument;
		this.role = role;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdDocument() {
		return idDocument;
	}
	public void setIdDocument(String idDocument) {
		this.idDocument = idDocument;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	
}
