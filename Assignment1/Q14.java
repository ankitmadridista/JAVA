import java.util.Scanner;
class Q14{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");

		int year = sc.nextInt();		
		
		if( year % 4 == 0 || ( year % 100 != 0 && year % 400 == 0 ) )
			System.out.println("Leap year");			
		else
			System.out.println("Not a Leap year");		
	}	
}	