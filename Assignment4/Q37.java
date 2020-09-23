import java.util.Scanner;

class Person{
	int age;
	String name;
	Person(){
		this.age = 18;
		this.name = "";
	}

	Person(int age,String name){
		this.age = age;
		this.name = name;
	}
	void display (){
		System.out.println("Name : " + this.name + "Age : " + this.age);
	}
}

class PersonDemo{
	public static void main(String []args){
		Person p1 = new Person();
		Person p2 = new Person(25,"xyz");

		p1.display();
		p2.display();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : " );
		String name = sc.next();
		System.out.println("Enter Age :");	
		int age = sc.nextInt();
		Person p3 = new Person(age,name);
		p3.display();
		
		
	}
}
