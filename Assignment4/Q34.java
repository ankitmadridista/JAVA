import java.util.Scanner;
class Circle{
	private double radius;
	private double area;
	void init(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		this.radius = sc.nextInt();
	}
	void calculateArea(){
			this.area = 3.14 * this.radius * this.radius;
	}
	void display(){
		System.out.println( "Radius: " + radius + " Area: " + area );	
	}	
}

class CircleDemo {
	public static void main(String args[]){
		Circle c = new Circle();
		c.init();
		c.calculateArea();
		c.display();
	}
}