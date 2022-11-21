package PracticeProblem;

public class sumOf1stNaturalNumb {
	public static void main(String[] args) {
		int sum = 0;
		int N = 10;
		System.out.println("First "+ N +"Numbers = ");
		
		for(int i=0; i<=10;i++){
			System.out.println(i + " ");
			sum += i;
		}
		
		System.out.println("Sum of First " + N  +  " Numbers = " + sum);
			
		
	} 

}
