
// import the Scanner class
import java.util.Scanner;

public class App {

	private static final String Footlong = null;
	// Scanner Object
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		orderBurger();
	}

	static void orderBurger() {

		System.out.println("Welcome to Shacks Burger!");

		System.out.println("Enter letter A if you want a Burger!");
		System.out.println("Enter letter B if you want a Footlong!");

		System.out.print("Enter your choice: ");
		char choice = scan.next().charAt(0);

		// Initial value
		String burger = "";
		double price = 0;

		switch (choice) {
			case 'A':
				burger = "Burger";
				price = 50;
				break;
			case 'B':
				price = 70;
				break;
			default:
				System.out.println("Please enter A or B!");
				return; // EXIT PROGRAM
		}

		System.out.println("Your order is: " + burger + Footlong);
		System.out.println("Your total order amount is: " + price);

		System.out.println("Enter COD if you want cash on delivery!");
		System.out.println("Enter CREDIT if you want to use credit card!");

		System.out.print("Enter your choice: ");
		String paymentMethod = scan.next();

		switch (paymentMethod) {
			case "COD":
				System.out.println("Please prepare exact amount upon delivery");
				break;
			case "CREDIT":
				System.out.print("Enter CREDIT card number:");
				break;
			default:
				System.out.println("Please dont make fun of me!");
				return;
		}

		System.out.println("Do you have an Shacks Burger card? (true or false)");
		System.out.print("Please enter true or false: ");
		boolean hasShacksBurgerCard = scan.nextBoolean();

		if (hasShacksBurgerCard == true) {
			System.out.println("You get a free Burger!");
		} else {
			System.out.println("You can buy a card to get free Burger!");
		}

		System.out.println("Choose delivery method!");
		System.out.println("Enter PICKUP if you are nearby!");
		System.out.println("Enter DELIVER if you are far away!");
		System.out.print("Enter delivery method: ");
		String deliveryMethod = scan.next();

		switch (deliveryMethod) {
			case "PICKUP":
				System.out.println("Thanks for waiting buy again !");
				break;
			case "DELIVER":
				System.out.print("Thanks for waiting come back again!");
				break;
			default:
				System.out.println("Do want to buy again");
				return;
		}

		scan.close();
	}
}
