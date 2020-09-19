import java.util.Scanner;
class Q12{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic salary: ");

		double sal = sc.nextDouble();
		double hra = 0;		
		double da = 0;
		
		if( sal < 10000 ){
			hra = sal * 0.1;
			da = sal * 0.9;
		}
		else if( sal >= 10000 ){
			hra = 2000;
			da = sal * 0.98;
		}

		System.out.println("Gross salary: "+ (sal+hra+da) );	
	}	
}	