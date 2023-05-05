package bean;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class HelloFormBackup extends ActionForm {
	private String name;
	public void setName(String name)
	{
		this.name= name;
	}
	public String getName()
	{
		return name;
	}
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		ActionErrors ae= new ActionErrors();
		if(name.equals(""))
			ae.add("name_e" , new ActionMessage("msg"));
		return ae;
	}
}
