import java.util.Scanner;
import java.lang.Math;
class MathOperation{
	static int add(int a, int b){
		return a + b ;
	}
	static int subtract(int a, int b){
		return a - b ;
	}
	static int multiply(int a, int b){
		return a * b ;
	}
	static double power(int a, int b){
		return Math.pow(a, b) ;
	}
		
}

class Demo{
	public static void main(String args[]){
		System.out.println("Enter two nos: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = MathOperation.add(a,b);
		System.out.println("Sum: of " + a + "+" + b + " = " + sum);
		int sub = MathOperation.subtract(a,b);
		System.out.println("Subtract: " + sub);
		int mul = MathOperation.multiply(a,b);
		System.out.println("Mul: " + mul);
		double pow = MathOperation.power(a,b);
		System.out.println("Pow: " + pow);
	}
}