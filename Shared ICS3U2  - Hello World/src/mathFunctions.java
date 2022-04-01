import java.util.Scanner;
import java.lang.Math;
public class mathFunctions {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("1) Multiply two numbers");
		System.out.println("2) Calculate a power of a number");
		System.out.println("3) Calculate the factorial of a number");
		System.out.println("4) Calculate hypoteneuse of right triangle");
		System.out.print("Choose an option: ");
		int option = scanner.nextInt();

		switch(option) {
			case 1:
				System.out.print("Enter number 1: ");
				int a = scanner.nextInt();
				System.out.print("Enter number 2: ");
				int b = scanner.nextInt();
				System.out.println("The product is " + aTimesB(a,b));
				break;
			case 2:
				System.out.print("Enter the base: ");
				int base = scanner.nextInt();
				System.out.print("Enter the exponent: ");
				int exp = scanner.nextInt();
				System.out.println("The answer is " + aToThePowerOfB(base,exp));
				break;
			case 3:
				System.out.print("Enter the number to factorialize: ");
				int n = scanner.nextInt();
				System.out.println(n + " factorial is " + factorialOf(n));
				break;
			case 4: 
				System.out.println("Enter side length A: ");
				int A = scanner.nextInt();
				System.out.println("Enter side length B: ");
				int B = scanner.nextInt();
				System.out.printf("The hypoteneuse is %-10.4f", hypoteneuse(A,B));
				break;
			default:
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

	public static int factorialOf(int a) {
		for (int i = a-1; i > 0; i--) {
			a *= i;
		}
		return a;
	}
	
	public static double hypoteneuse(int a, int b) {
		int newA = a*a;
		int newB = b*b;
		
		double hyp = Math.sqrt((double)newA + newB);
		return hyp;
	}
}
