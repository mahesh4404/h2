package login.hari.registration;

import java.sql.*;

public class DoctorDAOImpl implements DoctorDAO {

	static Connection con;
	static PreparedStatement ps;
	@Override
	public int insertDoctor(Doctor d) {
		int status=0;
		try {
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("insert into Doctor values(?,?,?)");
			ps.setString(1, d.getUsername());
			ps.setString(2, d.getPassword());
			ps.setString(3, d.getName());

			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return status;
	}

	@Override
	public Doctor getDoctor(String userid, String pass) {
		Doctor d=new Doctor();
		int i=0;
		try
		{
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("select * from doctor where userid=? and password=?");
			ps.setString(1, userid);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			System.out.println(rs);
			while(rs.next())
			{
				d.setUsername(rs.getString(1));
				d.setPassword(rs.getString(2));
				d.setName(rs.getString(3));
				
			}
		
		}
		catch(Exception e)
		{
			
		}
		return d;
	}

}
