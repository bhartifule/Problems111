package PracticeProblem;
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number:");
		num = scan.nextInt();
		if(num>0) {
			System.out.println("The Number is even:");
		}
			
		else
			System.out.println("The Number is Odd");
	}

}
