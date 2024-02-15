package OOP.Challenge.Challenge92;

public class Test {
    public static void main(String[] args) {
        HourlyEmployee employeePartTime = new HourlyEmployee("Thu trang", "20/12/2002",
                "1/1/2024", 007, "1/1/2003", 2);
        employeePartTime.getDoublePay();
        employeePartTime.terminate("2/2/2025");
        System.out.println(employeePartTime.getAge());
        System.out.println(employeePartTime);
        System.out.println("-----------------------");
        SalaryEmployee salaryEmployee = new SalaryEmployee("Vinh", "13/04/1995", "1/1/2026"
        , 123, "1/1/2020", 10000);
        System.out.println(salaryEmployee);
        System.out.println("Vinh's paycheck = $" + salaryEmployee.collectPay());
        salaryEmployee.retire();
        System.out.println("Vinh's paycheck = $" + salaryEmployee.collectPay());
        System.out.println(salaryEmployee);
    }
}
