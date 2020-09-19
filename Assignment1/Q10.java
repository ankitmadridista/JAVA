import java.util.Scanner;
class Q10{
	public static void main(String ar[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter temperature(Fahrenheit): ");

	double tempF = sc.nextDouble();
	
	double tempC = 5 * ( tempF -32 ) / 9;

	System.out.println("Temperature in celcius: "+ tempC);
			
	}	
}	