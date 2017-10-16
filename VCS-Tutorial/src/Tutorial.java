import java.util.Scanner;


public class Tutorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		
		String firstName = scanner.next();
		
		System.out.println("Please enter your last name: ");
		
		String lastName = scanner.next();
		
		System.out.println("Please enter your Matrikelnummer: ");
		
		int matrikelnummer = Integer.parseInt(scanner.next());
		
		Student s = new Student(firstName, lastName, matrikelnummer);
		
		System.out.println("Welcome, "+s.getFirstName()+", to the Introduction to Version Control Systems!");
		
		scanner.close();
		
	}

}
