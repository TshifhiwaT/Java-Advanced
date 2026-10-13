package Chapter7;

public class StudentRunner {
    static void main(String[] args) {
        Student objStudent = new Student();
        Student objThabo = new Student("123456", "Thabo", "Smith", "thabo@naet.com");
        objThabo.setAssesments(75, 74, 63);//objThabo.setFirstName("Thabo");
        //objThabo.setLastName("Dlamini");

        System.out.println("======Defualt Constructor==========");
        objStudent.display();
        System.out.println("======overloaded constructor=======");
        objThabo.display();
    }
}
