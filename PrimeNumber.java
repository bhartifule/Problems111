package PracticeProblem;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		int num = 0;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Number");
		num= Scan.nextInt();
// num=30 
		boolean flag = false;
		for (int i = 2; i<= num /2 ; ++i) {
			if(num % i == 0) {
				flag =true;
				break;
			}
		}
		if(!flag)
			System.out.println(num + " is a prime number. ");
		else
			System.out.println(num + " is Not Prime Number. ");
	}

}
