<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelloWorld page</title>
</head>
<body>
	Greeting : ${greeting}
	<a href="/jdevsite-web-app/helloagain">/helloagain</a>
	</br>
	</br>
	<a href="/jdevsite-web-app/helloagain.htm">HTML</a>
	</br>
	<a href="/jdevsite-web-app/service/HelloWorld?wsdl">WSDL</a>
	</br>
	<a href="/jdevsite-web-app/hello/Raf.json">REST/JSON</a>
	</br>
	<a href="/jdevsite-web-app/hello/Raf">REST/XML</a>
	</br>
	<a href="/jdevsite-web-app">HOME</a>
</body>
</html>