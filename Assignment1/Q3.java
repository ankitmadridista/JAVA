import java.util.Scanner;
class Q3{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String ch = sc.next();
		int x = 5;
		int res;
		switch(ch){
			case "A": res = x*x + (3*x) - 7;
				System.out.println(res);
				break;
				 
			case "B": res = (x++) + (++x) ; //5+7
				System.out.println(res);
				break;
			case "C":
				System.out.println("Enter y: ");
				int y = sc.nextInt(); 
				res = x++ - --y - --x  +  x++;
				System.out.println(res);
				break;

			case "D":
				System.out.println("Enter 2 bool values");

				boolean a = sc.nextBoolean();
				boolean b = sc.nextBoolean();
				boolean c;
					
				c = a && b || !(a || b);
				System.out.println(c);
				break;
			}
	}
}	