package OOP.Challenge.Challenge92;

public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() { // luong thuong ngay
        return this.hourlyPayRate * 40;
    }

    public double getDoublePay() { // dịp lễ x2 lương
        return 2 * this.collectPay();
    }
}
