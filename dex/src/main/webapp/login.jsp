<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>DexChallenge | Login</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DexChallenge | Login</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
    @font-face
	{
	    font-family:'Barking';
		src: url('Barkingcat.oft) format('opentype');
	
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


	<form action="UserController" method="POST">
	    <input type="hidden" name="action" value="login" />
	    <div style="padding-top:20vh;">
	    
		<table style="align:center;width:100%;">
			<tr>
				<td colspan="2" align="center" style="color:#5DADE2;font-size:large;">LOG IN</td>
			</tr>
			<tr>
				<td align="right" width="50%">User Name -</td>
				<td width="50%"><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td align="right" width="50%">Password -</td>
				<td width="50%"><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td align="right" width="50%"></td>
				<td width="50%"><input type="submit" name="submit" value="Login" /></td>
			</tr>
			<tr>
				<td colspan="2"></td>
			</tr>
			<tr>
				<td align="right" width="50%"></td>
				<td width="50%">Don't have an account?<a href="signin.jsp">sign-in here</a></td>
			</tr>
		</table>
		</div>
	</form>
</body>
</html>