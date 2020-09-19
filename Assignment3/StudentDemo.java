import java.util.Scanner;
class Student{
	private int rno;
	private String name;
	void setData(int no, String n){
		rno = no;
		name = n;
	}
	void showData(){
		System.out.println("Roll no: " + rno + " Name: " + name );
	}	
}

class StudentDemo{
	public static void main(String args[]){
		Student s1 = new Student();
		s1.setData(4,"Ramos");
		s1.showData();
	}	
}


