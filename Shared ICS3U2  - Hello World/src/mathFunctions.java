import java.util.Scanner;
public class mathFunctions {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1) Multiply two numbers");
		System.out.println("2) Calculate a power of a number");
		System.out.print("Choose an option: ");
		int option = scanner.nextInt();
		if (option == 1) {
			System.out.print("Enter number 1: ");
			int a = scanner.nextInt();
			System.out.print("Enter number 2: ");
			int b = scanner.nextInt();
			System.out.println("The product is " + aTimesB(a,b));
		}else if (option == 2) {
			System.out.print("Enter the base: ");
			int base = scanner.nextInt();
			System.out.print("Enter the exponent: ");
			int exp = scanner.nextInt();
			System.out.println("The answer is " + aToThePowerOfB(base,exp));
		}else {
			System.out.println("Not a valid option.");
		}
		
		
	}
	
	public static int aTimesB(int a, int b) {
		return a*b;
	}
	
	public static int aToThePowerOfB(int a, int b) {
		int power = 1;
		if (a == 0) {
			return 0;
		}
		for (int i = b; i > 0; i--) {
			power *= a;
		}
		return power;
	}
}
