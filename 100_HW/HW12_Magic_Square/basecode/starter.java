import pkg.*;
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of special squares: ");
		int x = sc.nextInt();
		CVMath.specialSquare(x);
	}
}
