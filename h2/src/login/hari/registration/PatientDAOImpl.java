package login.hari.registration;
import java.sql.*;
public class PatientDAOImpl implements PatientDAO {

	static Connection con;
	static PreparedStatement ps;
	@Override
	public int insertPatient(Patient p) {
		
		int status=0;
		try {
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("insert into Patienttab values(?,?,?)");
			ps.setString(1, p.getUsername());
			ps.setString(2, p.getPassword());
			ps.setString(3, p.getName());

			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return status;
	}
	public Patient getPatient(String userid, String pass) {
		Patient d=new Patient();
		int i=0;
		try
		{
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("select * from Patienttab where userid=? and password=?");
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
