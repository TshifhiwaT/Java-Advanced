package Chapter7.Inheritance;

public class Employee {
    protected String empNumber;
    protected String name;
    protected String email;

    public Employee(String empNumber, String name, String email) {
        this.empNumber = empNumber;
        this.name = name;
        this.email = email;
    }

    public Employee() {
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display(){
        System.out.println("Employee#: " + getEmpNumber());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
    };
}
