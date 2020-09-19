import java.util.Scanner;
class Q21{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 elements: ");
		
		int arr[] = new int[10]; 			
			
		for( int i = 0 ; i < 10 ; i++ ){
			arr[i] = sc.nextInt();
		}	
		
		int sum = 0;
		for( int a : arr ){
			sum = sum + a;
			
			
		}	
		System.out.println("SUM : " + sum);
		System.out.println("AVERAGE : " + sum/10);
	}	
}	