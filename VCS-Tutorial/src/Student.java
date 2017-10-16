
public class Student {
	private String firstName;	
	private String lastName;
	private int matrikelnummer;
	
	public Student(String firstName, String lastName, int matrikelnummer){
		this.firstName = firstName;
		this.lastName = lastName;
		this.matrikelnummer = matrikelnummer;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
}
