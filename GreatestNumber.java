package PracticeProblem;
import java.util.Scanner;
public class GreatestNumber {
	public static void main(String[] args) {
		int num1,num2,num3;
		System.out.println("Enter Three Numbers:");
		Scanner scan = new Scanner(System.in);
		num1= scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
if(num1 > num2 && num1 > num3) {
	System.out.println("The Greater No is:"+ num1);
}else if(num2>num1&&num2>num3) {
	System.out.println("The Greater Number is:"+ num2);
}else if(num3>num1&&num3>num2) {
	System.out.println("The Greater Number is:"+ num3);
}else {
	System.out.println("The Number is Smaller");
}
		}
   
}
