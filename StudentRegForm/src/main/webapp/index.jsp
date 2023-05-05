<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<h1>StudentRegForm</h1>
<html:form action="StudentReg" method="post">
	<table>
		<!-- name & name_e is the object stored in bean -->
		<tr>
			<td>Name</td>
			<td><html:text property="name"/></td>
			<td><html:errors property="name_e"/></td>
		</tr>
		<!-- email & email_e is the object stored in bean -->
		<tr>
			<td>E-mail</td>
			<td><html:text property="email"></html:text></td>
			<td><html:errors property="email_e"/></td>
		</tr>
		<!-- address & address_e  is the object stored in bean-->
		<tr>
			<td>Address</td>
			<td><html:textarea property="address"></html:textarea></td>
			<td><html:errors property="address_e"/></td>
		</tr>
		<tr>
			<td><html:submit value="Register"/></td>
		</tr>
		
		</table>

</html:form>