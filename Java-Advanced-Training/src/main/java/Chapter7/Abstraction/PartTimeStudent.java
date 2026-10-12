package Chapter7.Abstraction;

public class PartTimeStudent extends Student{
    /**
     * calculate and return semester mark
     *
     * @param test
     * @param assignment1
     * @param assignment2
     * @return Semester mark
     */
    @Override
    public double calculateSemesterMark(int test, int assignment1, int assignment2) {
        return (test + assignment1 + assignment2)/3;
    }

    /**
     * Calculate and return final mark
     *
     * @param semesterMark
     * @param examMark
     * @return final mark
     */
    @Override
    public double claculateFinalMark(double semesterMark, double examMark) {
        return 0;
    }

    /**
     * Display Student details
     */
    @Override
    public void display() {

    }
}
