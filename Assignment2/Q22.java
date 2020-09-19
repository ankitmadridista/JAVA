import java.util.Scanner;
class Q22{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 elements: ");
		
		int arr[] = new int[10]; 			
			
		for( int i = 0 ; i < 10 ; i++ ){
			arr[i] = sc.nextInt();
		}	
		
		
		System.out.println("Without sorting");
		for( int a : arr ){
			System.out.println(a);
		}	
		
		for( int i = 0 ; i < 10 ; i++ ){
			for( int j = 0 ; j < 10 ; j++ ){
				if( i != j ){
					if( arr[j] < arr[i] ){
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}

		System.out.println("After sorting");
		for( int a : arr ){
			System.out.println(a);
		}	
		
		

	}	
}	