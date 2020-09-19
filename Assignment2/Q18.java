import java.util.Scanner;
class Q18{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int flag = 0;
		
		int n= sc.nextInt();		
			
		for( int i = 2 ; i <= n / 2 ; ++i ){
			if( n % i == 0 ){
				flag = 1;
				break;
			}
		}
			if( n == 1 ) 
				System.out.println("Neither prime nor composite No");		
			else {
				if( flag == 0 )
					System.out.println("Prime No");		
				else 
					System.out.println("Not a Prime No");
			}
	}	
}	