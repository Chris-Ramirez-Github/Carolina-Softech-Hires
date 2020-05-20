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


<body>
  <%@ include file = "header.jsp" %>


<h1 style="text-align:center;color:#28559A; margin: 0px;">Page Not Found</h1>


 <div class="container marketing" style="margin:100px auto 150px auto; ">
<!-- START THE FEATURETTES -->


    <hr class="featurette-divider">
	 <div class="row featurette">
      <div class="col-md-7 order-md-2 featurette-text error">
        <h2 class="featurette-heading" style="text-align:center; padding-top:25px;">Oops.<span class="text-muted"> The page you are trying to reach doesn't exist.</span></h2>
        <h2 class="featurette-heading" style="text-align:center; padding-top:25px;"> <%= request.getParameter("errorMessage")%></h2>
        <p class="lead"><a href="mailto:carolinasoftech@gmail.com"><span class="fa fa-envelope" style=" color:#28559A;"></span></a><span style="font-size:25px;">Contact Support by clicking on</span>
		<a href="mailto:carolinasoftech@gmail.com" style="display:inline;color:#28559A;text-decoration:underline;font-size:25px;"><span >carolinasoftech@gmail.com</span></a></p>
		<p class="lead"><a href="index.jsp"><span  class="fa fa-home" style="color:#28559A;"></span></a><span style="font-size:25px;">Return to Carolina Softech Hires by clicking on</span>
		<a href="index.jsp" style="display:inline;color:#28559A;text-decoration:none;font-size:25px;"><span>Home page</span></a></p>
      </div>
    
    </div>
	
    		


</div>



<%-- <footer style="margin-top:-75px">
	<div class="footer-header" >
  	<a class="active" style="font-size:30px;">Carolina Softech Hires</a>
  	
  	<div class="icon-right">
  	 <a class="btn btn-social-icon btn-twitter" >
    <span class="fa fa-twitter"></span>
  </a>
  
 
  <a class="btn btn-social-icon btn-twitter">
    <span class="fa fa-facebook"></span>
  </a>
	
		
  <a class="btn btn-social-icon btn-twitter">
    <span class="fa fa-linkedin"></span>
  </a>
  </div>
  </div>
	<hr style="color:#28559A">
  <div class="footer-navbar">
<a href="${pageContext.request.contextPath}/index.jsp" class="active">Home</a>
  <a href="${pageContext.request.contextPath}/service.jsp" class="active">Services</a>
  <a href="${pageContext.request.contextPath}/contact.jsp" class="active">Contact Us</a>
 	<a class="right active">&copy; Carolina Softech Hires 2020. All rights reserved</a>
</div>

</footer> --%>
<%@ include file = "footer.jsp" %>

 <!-- jQuery (Bootstrap JS plugins depend on it) -->
  <script src="js/jquery-2.1.4.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/ajax-utils.js"></script>
  <script src="js/script.js"></script>
</body>
</html>