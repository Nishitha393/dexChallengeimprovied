<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DexChallenge | Chat</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
	{
	    font-family:'Barking';
		src: url('Barkingcat.oft) format('opentype');
	
	}
	.bottomright {
  position: absolute;
  bottom: 8px;
  right: 16px;
  font-size: 18px;
}
	
</style>
</head>
<body>
<nav class="navbar navbar-default" style="margin-bottom:0">
<div class="container">
<div class="row">
<div class="col-lg-6">
<h1 style="font-family:'Barking';color:#1589FF;">Dex Challenge</h1>
</div>
<div class="col-lg-6">
<ul class="navbar-nav nav">
<li><a href="aboutus.jsp">About Us</a></li>
<li><a href="index.jsp">Home</a></li>
<li><a href="past.jsp">Past</a></li>
<li><a href="login.jsp">Login</a></li>
<li><a href="signin.jsp">Sign-up</a></li>
<li><a href="Chat.jsp">Chat with us</a></li>
</ul>
</div>
</div>
</div>
</nav>
<div style="padding-top:10vh;">
</div>
<center>
<iframe
    allow="microphone;"
    width="600"
    height="550"
	style="border:1px solid black;"
    src="https://console.dialogflow.com/api-client/demo/embedded/DexChallenge_Bot">
</iframe>
</center>
</body>
</html>