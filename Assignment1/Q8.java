import java.util.Scanner;
class Q8{
	public static void main(String ar[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter principle: ");
	System.out.println("Enter rate of intrest: ");
	System.out.println("Enter time: ");

	double p = sc.nextDouble();
	double r = sc.nextDouble();
	double t = sc.nextDouble();
	
	double i = ( p * r * t ) / 100 ;
 
	System.out.println("Simple Interest: "+i);
			
	}	
}	