<%@ page language="java" import="java.sql.*"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="/h2/css/r_style.css" rel="stylesheet" type="text/css" />
<link href="/h2/css/r1.css" rel="stylesheet" type="text/css" />

</head>
<body>
	<p>ram</p>
	<form action="r_updatedetails.jsp" method="post">
		<div class="col-3 input-effect">
			<input class="effect-24" type="text" placeholder="" name="r_doc_id">
			<label>r_doc_id</label> <span class="focus-bg"></span>
		</div>
		<div class="col-3 input-effect">
			<input class="effect-24" type="text" placeholder="" name="r_pat_id">
			<label>r_pat_id</label> <span class="focus-bg"></span>
		</div>
		<div class="col-3 input-effect">
			<input class="effect-24" type="text" placeholder="" name="r_hss">
			<label>r_hs</label> <span class="focus-bg"></span>
		</div>

		<div class="field">
			<input type="submit" name="submit" value="update">
		</div>


	</form>
</body>
</html>
