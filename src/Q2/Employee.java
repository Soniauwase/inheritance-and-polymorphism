package Q2;

public class Employee {
     private int employeeId;
     private  String employeeName;
     private  String  employeeStatus;
     private double salary;


    public Employee(int employeeId, String employeeName, String employeeStatus, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeStatus = employeeStatus;
        this.salary = salary;
        if (salary<=0){
            System.out.println("salary can not be negative");
        }
        else {
            System.out.println("correct");
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public   double calculateBonus(){
        return calculateBonus();
    }
}

