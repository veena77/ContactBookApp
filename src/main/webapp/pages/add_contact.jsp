<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 style="text-align: center; color: blue">Contact Book Application</h1>
<!-- <noscript>
     <p style="color:red"> Enable Java Script please </p>
  </noscript>
 --><script lang ="JavaScript" src="validation.js">
<!--

//-->
</script>
<form:form modelAttribute="contact" action="saveContact" method="POST"
	onsubmit="return validate(this)">
	 <p style="color:red">
	<li><form:errors  path="*"/></li>
	</p>
    ${resMsg}<br>
	<table>
		<tr>
			<form:hidden path="cid" />
			<td>Contact Name::</td>
			
			<td><form:input path="cname" /> <form:errors path="cname" /><span
				id="ContactNameErr"></span></td>
		</tr>
		<tr>
			<td>EmailId::</td>
			<td><form:input path="mailId" /> <form:errors path="mailId" />
			<span id="EmailIdErr"></span></td>
		</tr>
		<tr>
			<td>Mobile No::</td>
			<td><form:input path="mbNo" /> <form:errors path="mbNo" /><span
				id="MbNoErr"></span></td>
		</tr>
		<tr>
			<td><input type="submit" value="Save"></td>
			<td><input type="reset"	value="Reset"></td>
			 <form:hidden path="vflag"/>
		</tr>

	</table>
</form:form>
<br>
<br>
<h2>
	<a href="viewContact">View All Contacts</a>
</h2>
