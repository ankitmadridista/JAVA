import java.util.Scanner;
class Q20{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range from: ");
		
		int a= sc.nextInt();		

		System.out.println("Enter range to: ");
		int b= sc.nextInt();		
		
		int flag = 0;
			
		for( int i = a ; i <= b ; i++ ){
			if( b % i == 0 ){
				flag = 1;
				//System.out.println("in if");	
				//break;				
			}
			if( flag == 0 )
				System.out.println(i);
		}		
	}	
}	