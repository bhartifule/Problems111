package PracticeProblem;
import java.util.Scanner;
public class sumOfNaturalNumber {
	public static void main(String[] args) {
	
		int sum = 0;
		System.out.println("Enter the number Value:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 0; i<num; i++) {
			sum = sum +i;
			}
		System.out.println("Sum of Numbers "+sum);
		}
}
 