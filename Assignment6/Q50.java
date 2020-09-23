import java.util.*;

class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary ){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }   
}

class Q50{
    public static void main(String[] args) {
       Employee e[] = new Employee[3];
       Scanner sc = new Scanner(System.in);
       int k = 0;
       for( int  i = 0 ; i < e.length ; i++ ){
            System.out.println("Enter emp details: ");
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double sal = sc.nextDouble();

            Employee e1 = new Employee(id, name, sal);
            if( i == 0 ){
                e[i] = e1; 
                k++; //k=1
            }
            else{
                for( int j = 0 ; j < k ; j++ ){//0 1 2
                    if(  e1.equals(e[j]) ) { 
                        System.out.println("empId already exist");
                    }
                    else{
                        k++;
                        e[i] = e1;
                        break;
                        
                    }
                }
            }
        }
    }
}