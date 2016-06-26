<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	page2<br>
	<!-- EL表达式语言，可以从page,request,session,application 中取得名字为userId的参数，并打印到页面上 -->
	<!-- 如果该表达式不存在，则返回空字符串“” ,如果有多个则返回靠前的对象（page,request,session,application）中的值-->
	<!-- 如果写成requestScope.userId则说明本次搜索只需子request里面寻找 .相应的还有pageScope、sessionScope、applicationScope-->
	得到简单的值：${requestScope.userId}<br>
	得到传过来的javabean的值:${user.userId }:${user.userName }<br>
	展示数组值${arrs[0] }....${arrs[1] }....${arrs[2] }<br>
	展示arraylist值：${list[0] }>>>${list[1] }>>>${list[2] }<br>
	展示map:${map["name"] } ....${map["sex"] }
	<br>
	<!-- param对象可以接收get方式请求来的数据（url?key=value） -->
	get方式请求时参数的接收：${param.studentName }
</body>
</html>