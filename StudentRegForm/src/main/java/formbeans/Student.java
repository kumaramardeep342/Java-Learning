package formbeans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

//backup
public class Student extends ActionForm{
	private String name,email,address;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override //validation
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		ActionErrors ae = new ActionErrors();
		if(name.equals(""))
			ae.add("name_e",new ActionMessage("msg1"));
		if(email.equals(""))
			ae.add("email_e",new ActionMessage("msg2"));
		if(address.equals(""))
			ae.add("address_e",new ActionMessage("msg3"));
		return ae;
	}
	
	@Override //store default name
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		name="Amar";
		email="amardeepkumar992@gmail.com";
		address="Hajipur 844122";
	}
}
