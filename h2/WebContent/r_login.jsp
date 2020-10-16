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
<h1>${sumessege} </h1>
	<div class="bg-img">
		<div class="content">
			<header>R_Doctor Login </header>
			<form action="r_loginverify.jsp" method="post">
				<div class="field">
					<span class="fa fa-user"></span> <input type="text" required
						placeholder="Email or Phone" name="username">
				</div>
				<div class="field space">
					<span class="fa fa-lock"></span> <input type="password"
						class="pass-key" required placeholder="Password" name="password1">
					<span class="show">SHOW</span>
				</div>
				<div class="pass">
					<a href="#">Forgot Password?</a>
				</div>
				<div class="field">
					<input type="submit" name="submit" value="login">
				</div>
			</form>

			<div class="signup">
				Don't have account? <a href="r_registration.jsp">Signup Now</a>
			</div>
		</div>
	</div>

</body>





</html>