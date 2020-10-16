<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    
    
 	<%
	String r_docid = request.getParameter("r_doc_id");
	String r_patid = request.getParameter("r_pat_id");
	String r_hs = request.getParameter("r_hss");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harisarvo","root","hari");
	Statement st=con.createStatement();
    
       int x=0;
    	ResultSet rs=st.executeQuery("SELECT * FROM  Patient");
    	while(rs.next())
    	{
    		if(rs.getString(2).equals(r_patid))
    		{
    			
    				x=1;
    				break;
    			
    	
    		}
    	}
    	if(x==1)
    	{
    		st.executeUpdate("update Patient set r_hes=' "+r_hs+" ' where pat_id=' "+r_patid+" ' ");
    	}
    	else
    	{
    		String har = "insert into Patient(doc_id,pat_id,r_hes) values('"+r_docid+"','"+r_patid+"','"+r_hs+"')";
    		st.executeUpdate(har);
    	}
%>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>