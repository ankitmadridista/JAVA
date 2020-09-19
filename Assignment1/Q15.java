import java.util.Scanner;
class Q15{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender and age: ");

		char gen = sc.next().charAt(0);
		
		int age = sc.nextInt();		
		
		if( gen == 'm' && age >= 21 ){
			System.out.println("Eligible");		
		}
		else if( gen == 'f' && age >= 18 ){
			System.out.println("Eligible");		
		}
		else
			System.out.println("Not Eligible");	
	}	
}	