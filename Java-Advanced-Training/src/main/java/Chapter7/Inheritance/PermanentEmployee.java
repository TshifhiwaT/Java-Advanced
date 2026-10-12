package Chapter7.Inheritance;

public class PermanentEmployee extends Employee{

    private double salary;

    public PermanentEmployee(String empNumber, String name, String email, double salary){
        super(empNumber, name, email);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void display(){
        System.out.println("Employee#: " + getEmpNumber());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Salary: " + getSalary());
    }
}
