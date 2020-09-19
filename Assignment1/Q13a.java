// if-else
import java.util.Scanner;
class Q13a{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three nos.: ");

		int a = sc.nextInt();		
		int b = sc.nextInt();
		int c = sc.nextInt();		
		
		while(true){
			if( a == b ){
				if( b == c ){
					System.out.println("all are equal");	
					break;
				}
			}
			if( a >= b ){	
				if( a > c ){
					System.out.println(a+" is greatest");			
					break;
				}		
			}
			if( b >= a ){
			
				if( b > c ){
					System.out.println(b+" is greatest");			
					break;
					}
			}
			if( c >= a ){
			
				if( c > b ){
					System.out.println(c+" is greatest");			
					break;
				}
			}
		}

	}	
}	