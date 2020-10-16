package login.hari.registration;

public interface DoctorDAO {
	public int insertDoctor(Doctor d);
	public Doctor getDoctor(String username,String pass);
}
