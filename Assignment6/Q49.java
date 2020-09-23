import java.util.*;
interface Taxable{
    double salesTax = 0.07;
    double incomeTax = 0.105;
    abstract void calcTax();

}
class Employee implements Taxable{
    int empId;
    String name;
    double salary;
    double it;
    Employee(int empId, String name, double salary ){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void calcTax(){
        it = salary * incomeTax;
    }
    void show(){
        System.out.println("Income tax: " + it );
    }

    
}

class Product implements Taxable{
    int pid;
    double price;
    double quantity;
    double st;

    Product(int pid, double price, double quantity ){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public void calcTax(){
        st = this.price * salesTax;
    }

    void show(){
        System.out.println("Sales tax: " + st );
    }

}

class Q49{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee details: ");
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double sal = sc.nextDouble();

        Employee e = new Employee(id, name, sal);
        e.calcTax();
        e.show();

        System.out.println("Enter Product details: ");
        int pid = sc.nextInt();
        double price = sc.nextDouble();
        double quantity = sc.nextDouble();

        Product p = new Product(pid, price, quantity);
        p.calcTax();
        p.show();
    }
}