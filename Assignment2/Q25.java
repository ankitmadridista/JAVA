import java.util.Scanner;
class Q25{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		
		int n = sc.nextInt();
	
		int arr[] = new int[n]; 			
			
		for( int i = 0 ; i < arr.length ; i++ ){
			arr[i] = sc.nextInt();
		}	
		
		int sumE = 0, sumO = 0, cntE = 0, cntO =0;
		
		for( int a : arr ){
			if( a % 2 == 0 ){
				sumE = sumE + a;
				cntE++;
				
			}
			else if( a % 2 != 0 ){
				sumO = sumO +a;	
				cntO++;
			}
		}	
		System.out.println("SUM of even nos.: "+ sumE +" Avg of even nos.: " + (sumE/cntE) );
		System.out.println("SUM of even nos.: "+ sumO +" Avg of even nos.: " + (sumO/cntO) );	
	}	
}	