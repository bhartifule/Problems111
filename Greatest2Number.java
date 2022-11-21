package PracticeProblem;
import java.util.Scanner;
public class Greatest2Number {
	public static void main(String[] args) {
		int num1=1,num2 = 0;
		System.out.println("Enter Two Number");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num1 = scan.nextInt();
		if(num1 == num2) {
			System.out.println("The Numbers equal");
		}else if(num1>num2) {
			System.out.println("The Number is Greater " + num1);
		}else {
			System.out.println("The Number is smallest " + num2);
		}
		
		
	}

}
