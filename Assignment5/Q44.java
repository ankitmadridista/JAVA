class Faculty{
    private int facultyid;
    private double salary;
    
    void input(int facultyid){
        this.facultyid = facultyid;
        //this.salary = salary;
    }

    void setSal(double salary){
            this.salary = salary;
    }

    void print(){
        System.out.println("Salary: " + salary);
    }
}
class FullTimeFaculty extends Faculty{
    private double basicSalary;
    private double allowance;

    void input(int facultyid, double basicSalary, double allowance){
        input(facultyid);
        this.basicSalary = basicSalary;
        this.allowance = allowance;

        double salary = basicSalary + allowance;

        setSal(salary);
    }
}
class PartTimeFaculty extends Faculty{
    private double workingHours;
    private double ratePerHours;

    void input(int facultyid, double workingHours, double ratePerHours){
        input(facultyid);
        this.workingHours = workingHours;
        this.ratePerHours = ratePerHours;

        double salary = workingHours * ratePerHours;
   
        setSal(salary);
    }
}

class demo{
    public static void main(String[] args) {
        FullTimeFaculty f = new FullTimeFaculty();   
        f.input(51, 25000, 5000); 
        //f.setSal(10000);
        f.print();
        PartTimeFaculty p = new PartTimeFaculty();   
        p.input(12, 24, 500); 
        //f.setSal(10000);
        p.print();
    }
}