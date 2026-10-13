package Chapter7.Abstraction;

public abstract class Student {
    /**
     * calculate and return semester mark
     * @param test
     * @param assignment1
     * @param assignment2
     * @return Semester mark
     */
    public abstract double calculateSemesterMark(int test, int assignment1, int assignment2);

    /**
     * Calculate and return final mark
     * @param semesterMark
     * @param examMark
     * @return final mark
     */
    public abstract double claculateFinalMark(double semesterMark, double examMark);

    /**
     * Display Student details
     */
    public abstract void display();

}
