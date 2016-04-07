<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="hello.do" method ="post">
	hello:<input type="text" name="userName"/>
	<input type="submit" value="提交"/>

</form>

 	<a href="user.do">根据beanname访问Controller</a><br/>   
    <a href="userInfo.do">根据URL访问Controller</a><br/>
     <a href="userController.do">根据Controller类名访问Controller</a>   
</body>
</html>