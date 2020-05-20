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

<div class="container" style="text-align:center;margin-bottom:-100px;">

	
	<h1 style="text-align:center;margin-top:10px;">Employer Search Result</h1>

	 <table id="hireList" >
            <tr>
                <th>Name</th>
                <th>Employment Title</th>
                <th>Job Title</th>
                <th>Phone</th>
                <th>City</th>
                <th>State</th>
            </tr>
            <c:forEach var="listHires" items="${hireSearch}">
                <tr>
                     <td><c:out value="${listHires.name}" /></td>
                   <td><c:if test="${ listHires.employment_status  == '0'}"> Employer </c:if></td>
<%--                     <td><c:out value="${listHires.employment_status}" /></td>--%>     
		            <td><c:out value="${listHires.role_status}" /></td>
                    <td><c:out value="${listHires.phone}" /></td>
                    <td><c:out value="${listHires.county}" /></td>
                    <td><c:out value="${listHires.state}" /></td>
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