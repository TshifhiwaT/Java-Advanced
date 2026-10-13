package Chapter8.Excercise;

public class Department {
    private String department;
    private int departmentId;
    private int maxEmp;

    public Department(String department, int departmentId, int maxEmp) {
        setDepartment(department);
        setDepartmentId(departmentId);
        setMaxEmp(maxEmp);
        try {
            enforceRules();
        } catch (DepartmentException ex) {
            throw new RuntimeException(ex.getMessage());
        }

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getMaxEmp() {
        return maxEmp;
    }

    public void setMaxEmp(int maxEmp) {
        this.maxEmp = maxEmp;
    }

    private void enforceRules() throws DepartmentException{
        String ex = String.format("""
                Department      : %s
                Department ID   : %d
                Max Employees   : %d""", department, departmentId, maxEmp);
        if(department.length() != 2){
            ex += "Department name should be 2 letter \n";
            throw new DepartmentException(ex);
        }
        if(departmentId < 100 || departmentId > 499){
            ex += "Department Id should be between 100 and 499 \n";
            throw new DepartmentException(ex);
        }
        if(maxEmp < 4 || maxEmp > 10){
            ex += "Maximum number if employees should be between 4 and 10";
            throw new DepartmentException(ex);
        }

    }
}
