package Chapter8.Excercise;

public class Department {
    private String department;
    private int departmentId;
    private int maxEmp;

    public Department(String department, int departmentId, int maxEmp) {

        try {
            setDepartment(department);
            setDepartmentId(departmentId);
            setMaxEmp(maxEmp);
        } catch (DepartmentException ex) {
            throw new RuntimeException(ex.getMessage());
        }

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) throws DepartmentException {
        if(department.length() != 2){
            throw new DepartmentException("\nDepartment name should be 2 letter");
        }
        this.department = department;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) throws DepartmentException {
        if(departmentId < 100 || departmentId > 499){
            throw new DepartmentException("\nDepartment Id should be between 100 and 499");
        }
        this.departmentId = departmentId;
    }

    public int getMaxEmp() {
        return maxEmp;
    }

    public void setMaxEmp(int maxEmp) throws DepartmentException{
        if(maxEmp < 4 || maxEmp > 10){
            throw new DepartmentException("\nMaximum number if employees should be between 4 and 10");
        }
        this.maxEmp = maxEmp;
    }

    public void display() {
        System.out.format("""
                Department      : %s
                Department ID   : %d
                Max Employees   : %d""", department, departmentId, maxEmp);

    }
}
