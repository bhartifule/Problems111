package PracticeProblem;
import java.util.Scanner;
public class SumOfDigitNumbers {
	public static void main(String[] args) {
		long number,sum;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		number = scan.nextLong();
		for(sum=0; number!=0; number=number/10) {
			sum =sum + number%10;
		}
		System.out.println("sum of digits" + sum);
	}
	}


