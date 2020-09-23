import java.util.*;
abstract class Processor{
    int data;
    void showdata(){
        System.out.println(data);
    }
    abstract void process();
}
class Factorial extends Processor{
    void process(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int num = sc.nextInt();
        int fact = 1;
        for( int i = 1 ; i <= num ; i++ ){
            fact = fact * i;            
        }
        data = fact;
    }
}
class Circle extends Processor{
    void process(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of circle.: ");
        int rad = sc.nextInt();
        data = (int)3.14 * rad * rad;
    }
}
class Q48{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice 1.factorial or 2.Circle area: ");
        int ch = sc.nextInt();
        if( ch == 1 ){
            Processor f = new Factorial();
            f.process();
            f.showdata();
        }
        else if( ch == 2 ){
            Processor f = new Circle();
            f.process();
            f.showdata();
        }
    }
}