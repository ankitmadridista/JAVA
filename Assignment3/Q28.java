import java.util.Scanner;
class Q28{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String arr[] = new String [5];
		System.out.println("\nEnter Array elements: ");
		for( int  i = 0 ; i < arr.length ; i++ ){
			arr[i] = sc.nextLine();
		}
		System.out.println("\nArray elements are: ");
		for ( String s : arr ){
			System.out.println(s);
		}
		
	}	
}


