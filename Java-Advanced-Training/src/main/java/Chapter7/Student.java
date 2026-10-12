package Chapter7;

import java.lang.classfile.ClassElement;

public class Student {

    private String studentNo;
    private String firstName;
    private String lastName;
    private String email;
    private int testMark, assignment1, assignment2;

    public Student() {
        studentNo = "000000";
        firstName = "No Name";
        lastName = "No Lastname";
        email = "none";
        testMark = 0;
        assignment1 = 0;
        assignment2 = 0;
    }

    /**
     * construct an object of student with attributes
     * @param studentNo student number
     * @param firstName First Name
     * @param lastName Last name
     * @param email email
     */
    public Student(String studentNo, String firstName, String lastName, String email) {
        setStudentNo(studentNo);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    private void setStudentNo(String strNum){
        this.studentNo =  "ST-26" + strNum;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAssesments(int test, int assignment1, int assignment2){
        this.testMark= test;
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;
    }

    public String getStudentNO() {
        return studentNo;
    }

    public String getName() {
        return firstName+ " "+ lastName;
    }

    public String getEmail() {
        return email;
    }

    public double getSemesterMark(){
        //test 40%, assignment1 = 35%, assignment2 = 25%
        return (this.testMark*0.4)+(this.assignment1*0.35)+(this.assignment2*0.25);
    }

    public void display(){
        System.out.println("Student#: "+ getStudentNO());
        System.out.println("Name: "+ getName());
        System.out.println("Email: "+ getEmail());
        System.out.println("Semester Mark: "+ getSemesterMark());
    }

}
