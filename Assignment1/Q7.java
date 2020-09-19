import java.util.Scanner;
class Q7{
	public static void main(String ar[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 5 subject marks: ");
	
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	double d = sc.nextDouble();
	double e = sc.nextDouble();
	
	double per = ( ( a + b + c + d + e ) / 500 ) * 100 ;
 
	
	System.out.println("Percentage marks= "+per+"%");
			
	}	
}	