<header>
    <nav id="header-nav" class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">


        <div class="navbar-brand">
        	<a href="index.jsp">
            <img src="images/Carolina-Softech-Logo.png"><span Style="color:#2867B2;font-size:30px;">Carolina Softech Hires</span></a>
          </div>

          <button id="navbarToggle" type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#collapsable-nav" aria-expanded="false" style="background-color:#28559A;">
            <span class="sr-only" >Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
        </div>

        <div id="collapsable-nav" class="collapse navbar-collapse">
           <ul id="nav-list" class="nav navbar-nav navbar-right">
            <li id="navHomeButton" class="visible-xs active">
              <a href="${pageContext.request.contextPath}/index.jsp">
                <span class="glyphicon glyphicon-home"></span> Home</a>
            </li>
            <li id="navMenuButton">
              <a href="${pageContext.request.contextPath}/signup.jsp">
                <span class="glyphicon glyphicon-user"></span><br class="hidden-xs"> Signup</a>
            </li>
            <li id="navMenuButton">
              <a href="${pageContext.request.contextPath}/login.jsp">
                <span class="glyphicon glyphicon-log-in"></span><br class="hidden-xs"> Login</a>
            </li>
          </ul><!-- #nav-list -->
        </div><!-- .collapse .navbar-collapse -->
      </div><!-- .container -->
    </nav><!-- #header-nav -->
  </header>

