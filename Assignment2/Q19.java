import java.util.Scanner;
class Q19{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		
		int n= sc.nextInt();		
		int sum = 0;
		int num = 0;
		for( int i = 1 ; i <= n ; ++i ){
			num = i * 10 + 2;
			sum = sum + num; 
			/*if( i == n)
				System.out.print(num);	
			else
				System.out.print(num + " + " );
			*/	
		}
		System.out.println();	
	
		System.out.println(sum);	
	}	
}	