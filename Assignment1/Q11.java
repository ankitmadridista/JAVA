import java.util.Scanner;
class Q11{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos.: ");

		double a = sc.nextDouble();
		double b = sc.nextDouble();
	
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a: "+ a + " b: " + b);
			
	}	
}	