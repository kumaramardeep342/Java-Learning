package beans;

import org.apache.struts.validator.ValidatorForm;

public class RegForm extends ValidatorForm {
	private int id;
	private long phone,creditcard;
	private float salary;
	private String name,email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public long getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(long creditcard) {
		this.creditcard = creditcard;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
