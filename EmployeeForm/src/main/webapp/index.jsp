<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<h1>Employee Form</h1>
<html:form action="reg" method="post">
	<table>
		<!-- id & id_e is the object stored in bean -->
		<tr>
			<td>ID:</td>
			<td><html:text property="id"/></td>
			<td><html:errors property="id_e"></html:errors></td>
		</tr>
		
		<!-- name & name_e is the object stored in bean --> 
		<tr>
			<td>Name:</td>
			<td><html:text property="name"/></td>
			<td><html:errors property="name_e"></html:errors></td>
		</tr>
		
		<!-- email & email_e is the object stored in bean -->
		<tr>
			<td>E-mail:</td>
			<td><html:text property="email"/></td>
			<td><html:errors property="email_e"></html:errors></td>
		</tr>
		
		<!-- address & address_e is the object stored in bean -->
		<tr>
			<td>Address:</td>
			<td><html:textarea property="address"/></td>
			<td><html:errors property="address_e"></html:errors></td>
		</tr>
		
		<!-- gender & gender_e is the object stored in bean --> 
	   <tr>
	   		<td>Gender:Male</td>
	   		<td><html:radio property="gender" value="Male"></html:radio></td>
	   		<td><html:errors property="gender_e"></html:errors></td>
	   	</tr>
	   	
	   	<tr>
	   		<td>Gender:Female</td>
	   		<td><html:radio property="gender" value="Female"></html:radio></td>
	   	</tr>
	   
		<!-- hobbies is the object stored in bean -->
		<tr>
			<td>Hobbies:</td>
			<td><html:checkbox property="hobbies" value="Cricket">Watching Cricket</html:checkbox></td>
			<td><html:errors property="hobbies_e"></html:errors></td>
		</tr> 
		<tr>
			<td></td>
			<td><html:checkbox property="hobbies" value="Reading Books">Reading Books</html:checkbox></td>
		</tr> 
		
		<tr>
			<td><html:submit value="Register"/></td>
		</tr>
		
	</table>	
</html:form>
