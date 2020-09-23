import java.util.Scanner;
class Employee{
	private int id;
	private String ename;
	void set(int id, String ename){
		this.id = id;
		this.ename = ename;
	}
	void display(){
		System.out.println( "ID: " + id + " Name: " + ename );	
	}	
}

class Q33{
	public static void main(String args[]){
		Employee e = new Employee();
		e.set(8,"Kroos");
		e.display();
		Employee e1 = new Employee();
		e1.set(9,"Benzema");
		e1.display();
	}
}