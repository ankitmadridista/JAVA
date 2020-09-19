import java.util.Scanner;
class Q9{
	public static void main(String ar[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter days: ");

	int days = sc.nextInt();
	
	int year = days / 365;
	int rem = days % 365;
	
	int month = rem / 30;
	rem = rem % 30;

	System.out.println("Year: "+ year + " Month: " + month + " Days: " + rem);
			
	}	
}	