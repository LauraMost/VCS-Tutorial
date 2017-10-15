import java.util.Scanner;


public class Tutorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		
		String user = scanner.next();
		
		System.out.println("Welcome, "+user+", to the Introduction to Version Control Systems!");
		
		scanner.close();
		
	}

}
