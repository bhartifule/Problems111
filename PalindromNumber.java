package PracticeProblem;
import java.util.Scanner;
public class PalindromNumber {
public static void main(String[] args) {
	String Original,Reverse = null;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter string");
	Original=scan.nextLine();
	int length = Original.length();
	for(int i=length-1; i>=0; i--) 
		Reverse = Reverse + Original.charAt(i);
	if(Original.equals(Reverse)) {
		System.out.println("number is palindrom");
	}else
		System.out.println("number is not palindrom");
		
}
}
