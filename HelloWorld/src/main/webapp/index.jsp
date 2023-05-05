<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<h1>HELLO FORM</h1>
<html:form action="hello">
NAME:<html:text property="name"/>
	 <html:errors property="name_e"/>
	<html:submit value="sayHello"/>
</html:form>