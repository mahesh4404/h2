<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    
   
    
    
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="/h2/css/r_style.css" rel="stylesheet" type="text/css" />
<link href="/h2/css/r1.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<form action="r_show" method="post">
		<div class="col-3 input-effect">
			<input class="effect-24" type="text" placeholder="" name="r_doc_id">
			<label>r_enter patient also</label> <span class="focus-bg"></span>
		</div>
	       <h1><i>R Patient Health Status is<h1><i> ${ram}</i></h1></i></h1>
	       <div class="field">
			<input type="submit" name="submit" value="check details">
		</div>
</form>
</body>
</html>