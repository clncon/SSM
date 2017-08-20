<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
     <title>login</title>

  </head>
  
  <body>
      <form action="${pageContext.request.contextPath}/loginsubmit.action">
                                              登录名:<input type="text" name="userid"/><br/>
                                              登录名:<input type="password" name="pwd"/><br/>
             <input type="submit" value="提交">
                                         
      </form>
  </body>
</html>
