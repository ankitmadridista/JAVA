package p1;

public class Q57 {

	public static void main(String[] args) {
		String str = "Hello Cdac Mumbai And Cdac Juhu";
		String s[]=str.split(" ");
		for(String a : s) {
			StringBuffer s1= new StringBuffer(a);
			System.out.print(s1.reverse()+" ");
		}
	}

}
