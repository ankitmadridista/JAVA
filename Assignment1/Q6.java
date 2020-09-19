import java.util.Scanner;
class Q6{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius of circle: ");
	
	double r = sc.nextDouble();	

	double area,peri;

	area = 3.14 * r * r;
	peri = 2 * 3.14 * r;

	System.out.println("Area of circle: "+area+" Circumference of circle: "+peri);
			
		
	}	
}	