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
  

<div class="container carousel">
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
 

      <div class="item active">
        <img src="images/image2.JPG" alt="A photo of Goodwill IT Trainees in a classroom" style="width:100%;height:500px;">
        <div class="carousel-caption right">
          <h1 style="font-size:35px;">Mission Statement</h1>
          <p style="font-size:25px;"><b>Carolina Softech Hires</b> mission is to help hiree's find a life time career in IT and to help Company's find candidates worth investing in.</p>
          <p>
		<a class="btn btn-lg btn-primary" href="service.jsp" role="button">Carolina Softech Hires Services</a>
		</p>
        </div>
      </div>

      <div class="item">
        <img src="images/image1.JPG" alt="A photo of Goodwill IT Trainees in a classroom" style="width:100%;height:500px;">
        <div class="carousel-caption right">
		<h1 style="font-size:35px;">We are good listener</h1>    
		<p style="font-size:25px;">We are here to make sure you put your best foot forward </p>
		<p>
		<a class="btn btn-lg btn-primary" href="contact.jsp" role="button">Contact Carolina Softech Hires</a>
		</p>
        </div>
      </div>
    
      <div class="item">
        <img src="images/orange.jpg" alt="A orange background" style="width:100%;height:500px;">
        <div class="carousel-caption">
          <h1 style="font-size:35px;">It's never to late to make a career change</h1>    
		<p style="font-size:25px;">Let Carolina Softech Hires help you make that change</p>
		<p>
		<a class="btn btn-lg btn-primary" href="signup.jsp" role="button">Sign up today</a>
		</p>
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>


<%@ include file = "footer.jsp" %>

 <!-- jQuery (Bootstrap JS plugins depend on it) -->
  <script src="js/jquery-2.1.4.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/ajax-utils.js"></script>
  <script src="js/script.js"></script>
</body>
</html>