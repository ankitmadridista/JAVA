import java.util.Scanner;
class Q24{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		
		int n = sc.nextInt();
	
		int arr[] = new int[n]; 			
			
		for( int i = 0 ; i < arr.length ; i++ ){
			arr[i] = sc.nextInt();
		}	
		
		int flag = 0;
		
		System.out.println("Enter an element to search: ");
		int s = sc.nextInt();
		for( int a : arr ){
			if( a == s ){
				flag = 1;
			}
		}	
		if( flag == 1 )
			System.out.println(s+" is Present");
		else
			System.out.println(s+" is Absent");
		
	}	
}	