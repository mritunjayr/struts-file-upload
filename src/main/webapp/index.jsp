<%-- 
    Document   : index
    Created on : Nov 27, 2019, 9:36:35 PM
    Author     : mritunjay
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<s:head />
</head>
<body>
	<h1>Spring struts2 Application</h1>
	<s:form action="uploadExcel" enctype="multipart/form-data">
		<s:file name="excelFile" id="fileUpload" />
		<s:submit id="upload" value="Upload" />
	</s:form>
	<hr />
	<div id="dvExcel"></div>
	<hr />
	<a href='<s:url action="index" namespace="config-browser" />'>Launch
		the configuration browser</a>

</body>
</html>
