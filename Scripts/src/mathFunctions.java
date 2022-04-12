import java.util.Scanner;
import java.lang.Math;
public class mathFunctions {
	
	static boolean quit = false;

	public static void main(String[] args) {

		System.out.println("1) Multiply two numbers");
		System.out.println("2) Calculate a power of a number");
		System.out.println("3) Calculate the factorial of a number");
		System.out.println("4) Calculate hypoteneuse of right triangle");
		System.out.println("5) Divide an integer by another");
		System.out.println("6) Square or square root a number");
		System.out.println("7) Add two fractions");
		
		do {
			options();
		}while (!quit);
		
	}
	
	private static void options () {
		
		System.out.print("Choose an option or '0' to quit: ");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		
		
		switch(option) {
		
			case 0:
				System.out.println("Goodbye!");
				quit = true;
				break;
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
				System.out.print("Enter side length A: ");
				int A = scanner.nextInt();
				System.out.print("Enter side length B: ");
				int B = scanner.nextInt();
				System.out.printf("The hypoteneuse is %-10.4f", hypoteneuse(A,B));
				break;
			case 5:
				System.out.print("Enter the dividend: ");
				int dividend = scanner.nextInt();
				System.out.print("Enter the divisor: ");
				int divisor = scanner.nextInt();
				System.out.printf("The quotient is %-10.2f", aDividedByB(dividend,divisor));
				break;
			case 6: 
				System.out.print("Would you like to square or square root a number? (Option 1 or 2) ");
				int sq = scanner.nextInt();
				if (sq != 1 && sq !=2) {
					System.out.println("Not a valid option, Try again");
					sq = scanner.nextInt();
				}
				if (sq==1) {
					System.out.print("What number would you like to square? ");
					int squ = scanner.nextInt();
					System.out.println(squ + " squared is: " + sqrt(sq,squ,squ));
					}
				if (sq==2) {
					System.out.print("What number would you like the square root of? ");
					int squ = scanner.nextInt();
					System.out.printf("The square root of " + squ + " is %-10.4f" , sqrt(sq,squ,squ));
				} 
				break;
			case 7:
				System.out.print("Enter the numerator of the first fraction: ");
				int numA = scanner.nextInt();
				System.out.print("Enter the denominator of the first fraction: ");
				int denA = scanner.nextInt();
				System.out.print("Enter the numerator of the second fraction: ");
				int numB = scanner.nextInt();
				System.out.print("Enter the denominator of the second fraction: ");
				int denB = scanner.nextInt();
				System.out.println(fractionAdder(numA,denA,numB,denB));
				break;
			default:
				System.out.println("Not a valid option. Try again");
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
	
	public static double aDividedByB(int a, int b) {
		return (double) a / b;
	}
	public static double sqrt(int sqrt,int a, int b) {
		Scanner scanner = new Scanner(System.in);
		double aa = a;
		double bb = b;
		double ans = 0;
		if (sqrt==1) {
			ans = aa*aa;
		}
		if (sqrt==2) {
			ans = Math.sqrt(bb);
		}
		return ans;
	}
	
	public static String fractionAdder(int numA, int denA, int numB, int denB) {
		int nA = numA;
	    int dA = denA;
	    int nB = numB;
	    int dB = denB;
	        
	    int newNum = nA * dB + nB * dA;
	    int newDen = dA * dB;
	    int gcd = 1;
	    //finds greatest common denominator
	    for(int i = 1; i <= newNum && i <= newDen; i++) {
            if(newNum%i==0 && newDen%i==0)
                gcd = i;
        }
	        
	    return "The sum of " + nA + "/" + dA + " + " + nB + "/" + dB + " = " + newNum/gcd + "/" + newDen/gcd;
	}

}
