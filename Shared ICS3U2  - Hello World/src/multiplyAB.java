import java.util.Scanner;
public class multiplyAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a = scanner.nextInt();
		System.out.print("Enter number 2: ");
		int b = scanner.nextInt();
		System.out.println(aTimesB(a,b));
		
	}
	
	public static int aTimesB(int a, int b) {
		return a*b;
	}

}
