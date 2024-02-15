package OOP.Challenge.Challenge92;

public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate, String endDate, long employeeId, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
