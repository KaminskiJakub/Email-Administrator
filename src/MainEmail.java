
public class MainEmail {

	public static void main(String[] args) {
		Email email1 = new Email("John", "Smith");
		
		email1.setAlternateEmail("j.smith@gmail.com");
		System.out.println(email1.getAlternateEmail());
		
		System.out.println(email1.showInfo());
	}

}
