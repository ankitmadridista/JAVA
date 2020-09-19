//ternary operator
import java.util.Scanner;
class Q13b{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three nos.: ");

		byte b = (byte)130;
		System.out.println("b: "+b);	
		int a = sc.nextInt();		
		int b = sc.nextInt();
		int c = sc.nextInt();		

		int ans = (a > b) ? ( b > c ? a : c) : (b > c ? b:c);
		System.out.println(ans + " is greatest" );		
	}	
}	