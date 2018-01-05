import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = ".kroxcompany.com";

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		this.department = setDepartment();

		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);

		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "" + companySuffix;
	}

	private String setDepartment() {
		System.out.println(
				"New Worker: " +  firstName + ". Department codes: \n1 for Sales \n2 for Develpment \n3 for Accounting \n0 for nothing \nEnter the department code:");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		if (departmentChoice == 1) {
			return "sales";
		} else if (departmentChoice == 2) {
			return "development";
		} else if (departmentChoice == 3) {
			return "accounting";
		} else {
			return "";
		}
	}

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHKJLMONPRSTUWVXYZ0123456789!@#$%^&*()";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		System.out.println("Your alternate email is: ");
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;	
	}
	
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName +
				"\nCompany email: " + email + 
				"\nMailbox Capacity: " +mailboxCapacity + " mb"; 
	}
}
