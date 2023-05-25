import java.util.Scanner;

/**
 * The Login class represents a user login functionality. It extends the User class,
 * which contains methods to collect user information such as first name, last name,
 * username, and password.
 */


public class Login extends User{
	public static void askUser() {
		
	}
	
	 /**
     * Prompts the user to enter their first name.
     */
	@Override
	public void firstName() {
		Scanner input = new Scanner(System.in);
		System.out.print("First Name: ");
		String firstName = input.nextLine();
		
	}

    /**
     * Prompts the user to enter their last name.
     */
	@Override
	public void lastName() {
		Scanner input = new Scanner(System.in);
		System.out.print("Last Name: ");
		String lastName = input.nextLine();
	}
  /**
     * Prompts the user to enter their username.
     */
	@Override
	public void username() {
		Scanner input = new Scanner(System.in);
		System.out.print("Username: ");
		String username = input.nextLine();
	}
  /**
     * Prompts the user to enter their password.
     */
	@Override
	public void password() {
		Scanner input = new Scanner(System.in);
		System.out.print("Password: ");
		String password = input.nextLine();
	}

	
}
