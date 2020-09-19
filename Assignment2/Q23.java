import java.util.Scanner;
class Q23{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		
		int n = sc.nextInt();
	
		int arr[] = new int[n]; 			
			
		for( int i = 0 ; i < arr.length ; i++ ){
			arr[i] = sc.nextInt();
		}	
		
		
		System.out.println("Without sorting");
		for( int a : arr ){
			System.out.println(a);
		}	
		
		System.out.println("After reverse");
		for( int i = arr.length-1 ; i >= 0 ; i-- ){
			System.out.println(arr[i]);
		}

	}	
}	