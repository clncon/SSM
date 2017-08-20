<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>jsonTest</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
  </head>
  
   <script type="text/javascript">
   
        //请求json相应json
        function requestJson(){
          
            alert("sfs");
        
           $.ajax({
           
                   type:'post',
                   url:'${pageContext.request.contextPath}/requestJson.action',
                   contentType:'application/json;charset=utf-8',
                    data:'{"name":"张三","age":15}',//json串
                    success:function(data){
                      alert(data.name);
                    }
           });
           
              
            
            
            
              
           
        }
        
        //请求key/value返回的是json
            
             function responseJson(){
                  
                  alert("ss");
                  $.ajax({
                     type:"post",
                     url:"${pageContext.request.contextPath}/responseJson.action",
                     data:"name=张三&aga=15",//key/value
                     success:function(data){
                     
                         alert(data.name);
                     }
           
                  });
             }
       
   </script>
  <body>
       
        <input type="button" value="请求json返回json" onclick="requestJson()"/>
        <input type="button" value="请求key/value返回json" onclick="responseJson()"/>
  </body>
  </body>
</html>
