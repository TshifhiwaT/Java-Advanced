package Chapter7.Inheritance;

public class EmployeeRunner {
    public static void main(String[] args) {
        PermanentEmployee objPemp = new PermanentEmployee("123456", "Jessica Smith", "jess@net.com", 15500 );
        ContractEmployee objCemp = new ContractEmployee("987654", "Mike Ross", 250.75, 38);

        objPemp.display();
        objCemp.display();
    }
}
