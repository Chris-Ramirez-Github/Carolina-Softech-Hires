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
  <style>
  
  form{
  width:100%;
	margin: 25px auto -100px auto;box-shadow:0 41.8px 33.4px rgba(0, 0, 0, 0.086);padding:25px;
  
  }
  </style>
      
    	
    	
</head>


<body>

 <%@ include file = "headerResult.jsp" %>



	
	<h1 style="text-align:center;margin-top:10px;">Search Result</h1>
	<hr>
	<div class="container" style="width: 100%;">

	 <table id="hireList" style="width: 90%;">
	 
            <tr>
            	<th style="text-align:center;">Job Listing ID</th>
            	<th style="display:none;">Job Seeker ID</th>
            	<th style="text-align:center;">Applicant Name</th>
                <th style="text-align:center;">Job Title</th>
                <th style="text-align:center;">Phone</th>
                <th style="text-align:center;">City</th>
                <th style="text-align:center;">State</th>
                <th style="display:none;">resumeTitle</th>
                <th style="display:none;">fileType</th>
                <th style="text-align:center;">Resume</th>
                
            </tr>
            <c:forEach var="listApplicants" items="${applicantList}">
                <tr>
                	<td><c:out value="${listApplicants.id}" /></td>
                	<td style="display:none;"><c:out value="${listApplicants.employeeUsername}" /></td>
                	<td><c:out value="${listApplicants.name}" /></td>
                	<td><c:out value="${listApplicants.jobTitle}" /></td>
                	<td><c:out value="${listApplicants.phone}" /></td>                  
                    <td><c:out value="${listApplicants.county}" /></td>
                    <td><c:out value="${listApplicants.state}" /></td> 
                    <td style="display:none;"><c:out value="${listApplicants.resumeTitle}" /></td>
                    <td style="display:none;"><c:out value="${listApplicants.fileType}" /></td> 
                    <td>
                     <a href="${pageContext.request.contextPath}/ApplicantResume?employeeUsername=<c:out value='${listApplicants.employeeUsername}' />&resumeTitle=<c:out value='${listApplicants.resumeTitle}' />&fileType=<c:out value='${listApplicants.fileType}' />"><button type="submit" class="btn btn-default">View Resume</button></a>                                     
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