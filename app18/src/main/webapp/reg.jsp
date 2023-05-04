<%!
int eno;
String ename;
Float esal;
String eadd;
%>
<%
try{	
	eno=Integer.parseInt(request.getParameter("eno"));
	ename=request.getParameter("ename");
	esal=Float.parseFloat(request.getParameter("esal"));
	eadd=request.getParameter("eadd");
}catch(Exception e){
	e.printStackTrace();
}
%>
<html>
<body>
<h2 style="color:red;" align="center">Durga Software Solutions</h2>
<h3 style="color:red;" align="center">Employee Registration form</h3>
	<table align="center" border="1">
			<tr>
					<td>Employee Number</td>
					<td> <%=  eno %>
			</tr>
			<tr>
					<td>Employee Name </td>
					<td> <%=  ename  %>
			</tr>
			<tr>
					<td>Employee Salary  in £</td>
					<td> <%=  esal %>
			</tr>
			<tr>
					<td>Employee Address </td>
					<td> <%=  eadd %>
			</tr>
	</table>
</body>
</html>