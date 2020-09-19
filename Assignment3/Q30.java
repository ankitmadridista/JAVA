import java.util.Scanner;
class Q30{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);		
		int arr[][] = new int[3][3];

		for( int i = 0 ; i < arr.length ; i++ ){
		
			System.out.println("Enter 3 elements of " + i + " row: ");
			for( int j = 0 ; j < 3 ; j++ ){
				arr[i][j] = sc.nextInt();
			}	
		}

		for( int i[] : arr ){
			for( int j : i ){
				System.out.print(j + " ");
			}
			System.out.println();
		}
		int sum = 0, sum2 = 0;
		for( int i = 0 ; i < arr.length ; i++ ){

			for( int j = 0 ; j < 3 ; j++ ){
				if( i == j ){
					sum += arr[i][j];
				}
				if( i + j == 2 ){
					sum2 += arr[i][j];
				}
			}	
		}
		System.out.println("Sum of digonal elements1: " + sum + " Sum of digonal elements2: " + sum2);
	}	
}


