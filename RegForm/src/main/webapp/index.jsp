<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<h1>RegForm</h1>
<html:form action= "reg" method="post" onsubmit="return validateRF(this)">
<html:javascript formName="RF" />
	<table>
		<!-- id & id_e is the object stored in bean -->
	  <tr>
		<td>ID</td>
		<td><html:text property="id"/></td> <td>
		<td><html:errors property="id_e"/></td>
	  </tr>
	   	
		<!-- name & name_e is the object stored in bean -->
	  <tr>
		<td>Name</td>
		<td><html:text property="name"/></td>
		<td><html:errors property="name_e"/></td>
	  </tr>
		
		<!-- email & email_e is the object stored in bean -->
	  <tr>
		<td>e-Mail</td>
		<td><html:text property="email"/></td>
		<td><html:errors property="email_e"/></td>
	  </tr>
				
		<!-- salary & salary_e is the object stored in bean -->
	  <tr>
		<td>Salary</td>
		<td><html:text property="salary"/></td>
		<td><html:errors property="salary_e"/></td>
	  </tr>
	   
	   <!-- creditcard & creditcard_e is the object stored in bean -->
	  <tr>
		<td>Creditcard</td>
		<td><html:text property="creditcard"/></td>
		<td><html:errors property="creditcard_e"/></td>
	  </tr>	   

	   <!-- phone & phone_e is the object stored in bean -->
	  <tr>
		<td>Phone</td>
		<td><html:text property="phone"/></td>
		<td><html:errors property="phone_e"/></td>
	  </tr>
	   	   
	  <tr>
	    <td><html:submit value="Register"/></td>
	  </tr>
	   
	</table>

</html:form>