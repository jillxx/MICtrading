<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>XxMICxX</title>
<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<style>  
.topnav {
    overflow: hidden;
    background-color: #333;
    position: fixed;
    width: 100%;
    top: 0px;
    z-index: 1;

}

body {
    margin-top:80px;
  
  	background: url("images/backg.png");


}
.container{
   margin-left:30px;

}
.jumbotron{
	background-color:lightgrey;
	background: rgba(255,255,255, 0.80);
	}
/* Style the links inside the navigation bar */
.topnav a {
    float: left;
    color: #f2f2f2;
    text-align: center;
    padding: 10px 20px;
    text-decoration: none;
    font-size: 17px;
    font-family:Algerian;

}
.head img {
  border-radius: 50%;
}
/* Change the color of links on hover */
.link a:hover {
    background-color: #ddd;
    color: black;
}
/* Add a color to the active/current link */
.topnav a.active {
    background-color:orange;
    color: white;
}

.link{
 padding: 9px 20px;
}


p {

    font-family: high tower text;
    font-size: 20px;
}
h2{
  font-family: Magneto;
}
h1{

  font-family: Magneto;
}
.row{
     font-family: high tower text;
   overflow: none;
}
h4{
  font-family: Magneto;
}

.bottomnav {
    background-color: #333;
    overflow: hidden;
    bottom: 0;
    width: 100%;
    position: relative;
    margin-top: 60px;
 /* negative value of footer height */
}
.bottomnav a {
    float: right;
    color: #f2f2f2;
    text-align: center;
    padding: 5px 20px;
    text-decoration: none;
    font-size: 15px;
    font-family:Algerian;

}
</style> 
</head>
<body>

<!-- facebook import-->
<div id="fb-root"></div>
<script>(function(d, s, id) {
  var js, fjs = d.getElementsByTagName(s)[0];
  if (d.getElementById(id)) return;
  js = d.createElement(s); js.id = id;
  js.src = 'https://connect.facebook.net/en_US/sdk.js#xfbml=1&version=v3.1';
  fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>

 <div class="topnav">
      <a style=" font-style: italic; color: orange; font-size: 30px;">M i C</a>

      <div class = "link">
        <a class = "active" href ="/">Home</a>
        <a href = "tradinglist">Trading List</a>
        <a href = "submit">Wanted Form</a>
      </div>
   </div>


   <div class="container">
      <div class="jumbotron">
        <h2>Welcome</h2>
          Hey Hey Friends<br><br>
			On behalf of all the guild members we would like to welcome you to the guild! You have just joined one of the largest and oldest guilds on this server. 
			The foundation of this guild is build upon friendly people just like you who want help and be part of a large family in the Onmyoji world.  
     </div>


     <div class="jumbotron">
        <h2>MoreInfo</h2>
          <p>The best place to get information is any officer in the guild! Just ask away and we will help you the best we can. 
          	 <br>Event time:<br>
          	 Kirin: <br>
          	 Guild Boss:
         </p>

  <div class="row">
    <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
      <h4> Achievement Highlight</h4>
       Level 8
        
    </div>
    <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
      <h4>Requirements</h4>
       <p>Guild Requirements:<br>
				1. 120 GQ weekly<br>
				2. 2000 duel score<br>
				3. If you are unable to maintain these requirements, you will most likely be kicked as and when we have new applications from players who can meet these requirements.<br>
				4. If you have any IRL complications, please refer to the discord channel and make us aware of your situation so you are not accidently kicked for being inactive/unable to maintain the weekly requirement.<br>
				
		</p>
     </div>
     <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
      <div class="fb-page" data-href="https://www.facebook.com/pg/Onmyojigame/posts/" data-tabs="timeline" data-small-header="true" data-adapt-container-width="true" data-hide-cover="false" data-show-facepile="false"><blockquote cite="https://www.facebook.com/pg/Onmyojigame/posts/" class="fb-xfbml-parse-ignore"><a href="https://www.facebook.com/pg/Onmyojigame/posts/">Onmyoji</a></blockquote></div>
   
     </div>
   </div>
  </div>
  </div>

  <div class="bottomnav">
      <div class = "link">
        <a href ="home.html">Home</a>
        <a href = "aboutme.html">About us</a>
        <a href = "portfolio.html">Portfolio</a>
      </div>
   </div>


</body>
</html>