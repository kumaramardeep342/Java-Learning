package formbeans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

//backup
public class Employee extends ActionForm {
	private int id;
	private String name,email,address,gender;
	private String[] hobbies;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	@Override //validation
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		ActionErrors ae=new ActionErrors();
		if(id==0)
			ae.add("id_e", new ActionMessage("msg"));
		if(name.equals(""))
			ae.add("name_e",new ActionMessage("msg1"));
		if(email.equals(""))
			ae.add("email_e",new ActionMessage("msg2"));
		if(address.equals(""))
			ae.add("address_e",new ActionMessage("msg3"));
		if(gender.equals(""))
			ae.add("gender_e",new ActionMessage("msg4"));
		if(hobbies.length<1)
			ae.add("hobbies_e",new ActionMessage("msg5"));	
	return ae;
	}

}
