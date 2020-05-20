<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  <link rel="stylesheet" href="css/bootstrap.min.css">
   -->
  
  <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>

<body >

<%@ include file = "header.jsp" %>



	<h1 style="text-align:center;margin-top: 25px;margin-bottom:25px;color:#28559A;">Carolina Softech Hires Login Form</h1>
	
<div class="container" style="width:100%; margin: 0px 0px 75px 0px;">
<form class="form-vertical" action="Login" method="post" style="width:50%;
	margin: 25px auto 0px auto;box-shadow:0 41.8px 33.4px rgba(0, 0, 0, 0.086);padding:25px;">
  
  
  <div class="form-group">
    <label for="username">Username: </label>
    <input type="text" class="form-control" id="username" name="username" pattern=".{5,10}" maxlength="10" required>
    <p id="passwordHelpBlock" class="form-text text-muted">Username length must be at least 6 characters and no more than 10 characters<p>
  	</div>
  	
  	 <div class="form-group">
      <label for="password">Password: </label> 
      <input id="field_password"  class="form-control" type="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,10}"  maxlength="10" name="password">
     <p id="passwordHelpBlock" class="form-text text-muted">
	Password must contain between 6  and 10 characters, including UPPER/lowercase and numbers</p>
     </div>
   <div class="text-center">
  <button type="submit" class="btn btn-default">Login</button>
  </div>
  <div class="text-center" >
 <h5>Not registered? <a href="signup.jsp" style="color:#28559A;">Create an account</a></h5>
 </div>
</form>


</div>

<%@ include file = "footer.jsp" %>

<!-- jQuery (Bootstrap JS plugins depend on it) -->
  <script src="js/jquery-2.1.4.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/ajax-utils.js"></script>
  <script src="js/script.js"></script>
</body>
</html>