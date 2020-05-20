<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
   <meta charset="UTF-8">
  <title>Carolina Softech Hires</title>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

   <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.3/css/bootstrap-select.min.css" />
   
   
  <!--  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
   
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="/css/bootstrap.min.css">
   -->
  
  <link rel="stylesheet" type="text/css" href="../css/styles.css">
  
</head>


<body>

  <%@ include file = "header.jsp" %>


	<h1 style="text-align:center;color:#28559A;margin-top:10px;margin-bottom:-35px;">Admin Profile</h1>
	
	<%String message = request.getParameter("message");%>
	<h3 style="text-align:center"> <%if(message == null || message.length() == 0){%>
   <%}else {%> 
   <%=request.getParameter("message")%>
   <% } %></h3>
	<div class="container" style="margin-bottom:125px;">
	<%String user=request.getParameter("name"); %>
	

	<%if(user == null || user.length() == 0){%>
		<%@ include file = "login.jsp" %>

   <%}else {%>
   		<div class="card text-center" style="margin: 20px auto auto auto; width:50%; border-raduis:12px; color:white;">
  <div class="card-header" style="background-color:#28559A; ">
   Admin Name
  </div>
  <div class="card-body">
    <h5 class="card-title" style="text-align:center;color:black;"><%=request.getParameter("name")%></h5>
  </div>
  <div class="card-header" style="background-color:#28559A;">
  	Contact Information
  </div>
  <div class="card-body">
    <h5 class="card-title" style="text-align:center;color:black;"><%=request.getParameter("phone")%></h5>
  </div>
  <div class="card-header" style="background-color:#28559A;">
   Job Title
  </div>
  <div class="card-body">
    <h5 class="card-title" style="text-align:center;color:black;"><%=request.getParameter("role-status")%></h5>
  </div>
  <div class="card-header" style="background-color:#28559A;">
   Location
  </div>
  <div class="card-body">
    <h5 class="card-title" style="text-align:center;color:black;"><%=request.getParameter("county")%> &#44; <%=request.getParameter("state")%></h5>
  </div>
  <div class="card-footer text-muted" style="background-color:none;">
  <br>
  </div>
</div>
   
   <% } %>
   </div>
	

	

 <%@ include file = "footer.jsp" %>



<!-- jQuery (Bootstrap JS plugins depend on it) -->
  <script src="../js/jquery-2.1.4.min.js"></script>
  <script src="../js/bootstrap.min.js"></script>
  <script src="../js/ajax-utils.js"></script>
  <script src="../js/script.js"></script>
</body>
</html>