package Chapter7.Abstraction;

public class FullTimeStudent extends Student{

    private double examMark;

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
        return (test*0.34)+(assignment1*0.33)+(assignment2*0.33);
    }

    /**
     * Calculate and return final mark
     *
     * @param semesterMark
     * @return final mark
     */
    @Override
    public double claculateFinalMark(double semesterMark, double examMark) {
        return (semesterMark * 0.5)+ (getExamMark() * 0.5);
    }

    /**
     * Display Student details
     */
    @Override
    public void display() {

    }

    public double getExamMark() {
        return examMark;
    }

    public void setExamMark(double examMark) {
        this.examMark = examMark;
    }
}
