import java.util.Scanner;
class Student{
	private int rno;
	private String name;
	private static int total;
	Student(){
		System.out.println("Const. called");
		total++;
	}
	void setData(int no, String n){
		rno = no;
		name = n;
		
	}
	void showData(){
		System.out.println("Roll no: " + rno + " Name: " + name + " No. of Student objects created: "+ total );
	}	
}

class StudentDemo1{
	public static void main(String args[]){
		Student s1 = new Student();
		s1.setData(4,"Ramos");
		s1.showData();
		Student s2 = new Student();
		s2.setData(5,"Varane");
		s2.showData();
	}	
}


