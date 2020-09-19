//logical operator
import java.util.Scanner;
class Q13c{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three nos.: ");

		int a = sc.nextInt();		
		int b = sc.nextInt();
		int c = sc.nextInt();		
		if(a == b && b == c ){
			System.out.println( "all are equal" );
		}
		else if( a > b && a > c ){
			System.out.println( a + " is greatest" );
		}
		else if( b > a && b > c ){
			System.out.println( b + " is greatest" );
		} 
		else if( c > a && c > b ){
			System.out.println( c + " is greatest" );
		} 

	}	
}	