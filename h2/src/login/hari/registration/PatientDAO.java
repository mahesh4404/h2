package login.hari.registration;

public interface PatientDAO{
	public int insertPatient(Patient p);

	public Patient getPatient(String userName, String password);

}
