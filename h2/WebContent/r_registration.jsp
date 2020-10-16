<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link  href="/h2/css/r_style.css" rel="stylesheet" type="text/css"/>

</head>

<body>
	<div class="bg-img">
		<div class="content">
			<header>R_Doctor Registration </header>
			<form action="loginRegister" method="post">
				<div class="field">
					<span class="fa fa-user"></span> <input type="text" required
						placeholder="name" name="username">
				</div>
				
				<div class="field space">
					<span class="fa fa-lock"></span> <input type="text"
						 required placeholder="R_Name" name="name">
					<span class="show">SHOW</span>
				</div>
				<div class="field space">
					<span class="fa fa-lock"></span> <input type="password"
						class="pass-key" required placeholder="Password" name="password1">
					<span class="show">SHOW</span>
				</div>
				
				<div class="field space">
					<span class="fa fa-lock"></span> <input type="password"
						class="pass-key" required placeholder="R_Retype Password" name="password2">
					<span class="show">SHOW</span>
				</div>
			
				<div class="field">
					<input type="submit" name="submit" value="register">
				</div>
			</form>

		</div>
	</div>
	
</body>





</html>