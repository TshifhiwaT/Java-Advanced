package Chapter8.Excercise;

public class ThrowDepartmentException {
    static void main(String[] args) {
        Department[] d = new Department[6];

        d[0] = new Department("IT", 404, 5);
        d[1] = new Department("ITC", 404, 8);
        d[2] = new Department("HR", 99, 9);
        d[3] = new Department("RE", 343, 12);
        d[4] = new Department("SAQ", 500, 10);
        d[5] = new Department("SOC", 252, 4);
    }
}
