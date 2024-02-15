package OOP.Challenge.Challenge92;

public class SalaryEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalaryEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;

    }


    public void retire() {
        terminate("12/12/2025");
        isRetired = true;
    }

    @Override
    public double collectPay() {
        double paycheck = this.annualSalary / 26; // chưa nghỉ hưu
        double adjustedPay = (isRetired) ? 0.7 * this.annualSalary : this.annualSalary;
        return adjustedPay; // lương hàng năm / 26 tuần
    }
}
