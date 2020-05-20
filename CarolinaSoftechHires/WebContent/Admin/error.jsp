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
   
  
  <link rel="stylesheet" type="text/css" href="../css/styles.css">
  
  
</head>


<body>

 <%@ include file = "headerResult.jsp" %>



 <div class="container result" style="text-algin:center;width:90%;
	margin: 0px auto -100px auto;box-shadow:0 41.8px 33.4px rgba(0, 0, 0, 0.086);padding:25px;">
<!-- start the featurettes -->


	 <div class="container" style="margin-top:10px;margin-bottom:10px;">
      
        <h2  style="text-align:center; ">Oops.<span class="text-muted"> The page you are trying to reach doesn't exist.</span></h2>
        <h2 style="text-align:center;"> <%= request.getParameter("errorMessage")%></h2>
        <p style="text-align:center;"><a href="mailto:carolinasoftech@gmail.com"><span class="fa fa-envelope" style=" color:#28559A;"></span></a><span style="font-size:25px;">Contact Support by clicking on</span>
		<a href="mailto:carolinasoftech@gmail.com" style="display:inline;color:#28559A;text-decoration:underline;font-size:25px;"><span >carolinasoftech@gmail.com</span></a></p>
		<p style="text-align:center;"><a href="index.jsp"><span  class="fa fa-home" style="color:#28559A;"></span></a><span style="font-size:25px;">Return to Carolina Softech Hires by clicking on</span>
		<a href="HireeProfile.jsp" style="display:inline;color:#28559A;text-decoration:none;font-size:25px;"><span>Home page</span></a></p>
      </div>
    
    </div>
	
    		





 <%@ include file = "footerResult.jsp" %>
 

 <!-- jQuery (Bootstrap JS plugins depend on it) -->
  <script src="js/jquery-2.1.4.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/ajax-utils.js"></script>
  <script src="js/script.js"></script>
</body>
</html>