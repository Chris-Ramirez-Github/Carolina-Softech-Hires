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


	<h1 style="text-align:center;color:#28559A;margin-top:10px;margin-bottom:-25px;">Employee Profile</h1>
	
	<%String message = request.getParameter("message");%>
	<h3 style="text-align:center"> <%if(message == null || message.length() == 0){%>
   <%}else {%> 
   <%=request.getParameter("message")%>
   <% } %></h3>
	<div class="container" style="margin-bottom:105px;">
	<%String user=request.getParameter("name"); %>
	

	<%if(user == null || user.length() == 0){%>
		<%@ include file = "login.jsp" %>

   <%}else {%>
   		<div class="card text-center" style="margin: 50px auto auto auto; width:50%; border-raduis:12px; color:white;">
  <div class="card-header" style="background-color:#28559A; ">
   Job Seeker Name
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


   <div class="card text-center" style="margin: 50px auto 50px auto; width:50%; color:white;">
  <div class="card-header" style="background-color:#28559A;">
   Upload Resume
  </div>
  <div class="card-body">
    <div class="card-title" style="color:black;">
    <form method="post" action="../FileUpload" enctype="multipart/form-data" style="width:100%;
	margin: 25px auto -100px auto;box-shadow:0 41.8px 33.4px rgba(0, 0, 0, 0.086);padding:25px;">
    <input type="hidden" name="username" value="<%=request.getParameter("username")%>"/>
    <h5>Resume Title </h5>
    <input type="text" name="resumeTitle" maxlength="15" required/><br>
    <h5>Select File Type</h5>
    <select class="form-control" id="fileType" name="fileType" style="margin-left:35%;width:30%;" required>
    	  <option disabled selected> -- select a file type -- </option>
          <option value="0" >PDF</option>
          <option value="1">MSWORD</option>
         
    </select>
    <h5>Upload File </h5>
	<input type="file" name="file" id="file" style="margin: 1px auto;"/><br>
	<div class="text-center">
    <input type="submit" value="Upload" name="upload" id="upload" />
    </div>
     </form>

        </div>
  </div>
  </div>
  
   <div class="card text-center" style="margin: 150px auto 50px auto; width:50%; border-raduis:12px;color:white;">
  <div class="card-header" style="background-color:#28559A;">
   Download Resume
  </div>
  <div class="card-body">
    <div class="card-title" style="color:black;">
    <form method="get" action="../FileRead" style="width:100%;
	margin: 25px auto -100px auto;box-shadow:0 41.8px 33.4px rgba(0, 0, 0, 0.086);padding:25px;">
    <input type="hidden" name="username" value="<%=request.getParameter("username")%>"/>
    <h5>Resume Title </h5>
    <input type="text" name="resumeTitle" maxlength="15" required/><br>
    <h5>Select File Type</h5>
    <select class="form-control" id="fileType" name="fileType" style="margin-left:35%;width:30%;" required>
    	  <option disabled selected> -- select a file type -- </option>
          <option value="0" >PDF</option>
          <option value="1">MSWORD</option>
         
          
    </select><br>
    <div class="text-center">
    <input type="submit"  value="View Resume" />
    </div>
     </form>

        </div>
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