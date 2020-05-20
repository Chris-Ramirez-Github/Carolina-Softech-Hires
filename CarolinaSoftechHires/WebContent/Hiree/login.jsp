<h2 style="text-align:center;margin-bottom:31px;color:#28559A;"> Log Back in</h2>
<form class="form-vertical" action="../Login" method="post" style="width:50%;
	margin: -25px auto -75px auto;box-shadow:0 41.8px 33.4px rgba(0, 0, 0, 0.086);padding:25px;">
  
  
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
  <button type="submit" class="btn btn-default">Submit</button>
  </div>
</form>
