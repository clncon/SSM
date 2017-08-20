<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息修改</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/stu/editstudentsubmit.action" method="post">

 <input type="hidden" name="id_" value="${student.id}">
姓名：<input name="student.name" value="${student.name}"/>
<br/>
年龄：<input name="age" value="${student.age}"/>
<br/>
出生日期：<input name="student.birthday" value="<fmt:formatDate value="${student.birthday}" pattern="yyyy-MM-dd"/>"/>

<br/>

用户状态
 <input type="radio" name="userstate" value="true">正常
 <input type="radio" name="userstate" value="false">异常
 <br/>
 用户成绩<br/>
                   课程名字<input type="text" name="scores[0].courseName">成绩<input type="text" name="scores[0].score"><br/>
                   课程名字<input type="text" name="scores[1].courseName">成绩<input type="text" name="scores[1].score"><br/>
                   课程名字<input type="text" name="scores[2].courseName">成绩<input type="text" name="scores[2].score"><br/>
                   课程名字<input type="text" name="scores[3].courseName">成绩<input type="text" name="scores[3].score"><br/>
   
<input type="submit" value="提交 "/> 
</form>
</body>
</html>