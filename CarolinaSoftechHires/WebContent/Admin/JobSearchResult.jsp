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
   
  
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
 
      
    	
    	
</head>


<body>

 <%@ include file = "headerResult.jsp" %>
 
 <h1 style="text-align:center;margin-top:10px;">Job Search Result</h1>
	<div class="container" style="width: 100%;">
	 
	 <table id="hireList" style="width: 90%;">
	 
            <tr>
            	<th style="text-align:center;">Job Listing ID</th>
            	<th style="text-align:center;">Company Name</th>
            	<th style="text-align:center;">Phone</th>
                <th style="text-align:center;">Job Title</th>
                <th style="text-align:center;">Job Description</th>
                <th style="text-align:center;">Work Schedule</th>
                <th style="text-align:center;">Pay Rate</th>
                <th style="text-align:center;">Pay Amount</th>
                <th style="text-align:center;">City</th>
                <th style="text-align:center;">State</th>
                <th style="text-align:center;">Delete Listing</th>
            </tr>
            <c:forEach var="listJobs" items="${jobSearch}">
                <tr>
                	<td><c:out value="${listJobs.id}" /></td>
                	<td><c:out value="${listJobs.name}" /></td>
                	<td><c:out value="${listJobs.phone}" /></td>
                    <td><c:out value="${listJobs.job_title}" /></td>
		            <td><c:out value="${listJobs.job_description}" /></td>
                    <td><c:out value="${listJobs.employment_time}" /></td>
                    <td><c:out value="${listJobs.employment_pay}" /></td>
                    <td><c:out value="${listJobs.employment_amount}" /></td>
                    <td><c:out value="${listJobs.county}" /></td>
                    <td><c:out value="${listJobs.state}" /></td>
                    <td>
                     <a href="${pageContext.request.contextPath}/Delete?id=<c:out value='${listJobs.id}' />"><button type="submit" class="btn btn-default">Delete Job Listing</button></a>                                     
                    </td>
                </tr>
            </c:forEach>

          
        </table>
   
       
	
	</div>
	
	


 <%@ include file = "footerResult.jsp" %>

<!-- jQuery (Bootstrap JS plugins depend on it) -->
  <script src="../js/jquery-2.1.4.min.js"></script>
  <script src="../js/bootstrap.min.js"></script>
  <script src="../js/ajax-utils.js"></script>
  <script src="../js/script.js"></script>
</body>
</html>