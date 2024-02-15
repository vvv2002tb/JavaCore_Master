package OOP;

public class AccountBanking {
    private String accountNumber;
    private double accountBalance;
    private String customName;
    private String email;
    private String phoneNumber;

    public AccountBanking() {
        this("0", 0, "Default name",
                "Default email","Default phone");
    }

    public AccountBanking(String accountNumber, double accountBalance, String customName, String emailCustomer, String phoneNumberCustomer) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customName = customName;
        email = emailCustomer;
        phoneNumber = phoneNumberCustomer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public void addBalanceToAccount(double number) {
        this.accountBalance = accountBalance + number;
        System.out.println("Bạn đã thêm thành công " + number
                + "$ vào tài khoản. Số dư mới là " + this.accountBalance + "$");
    }

    public void fundBalanceToAccount(double number) {
        if (this.accountBalance > 0 && this.accountBalance > number) {
            this.accountBalance = accountBalance - number;
            System.out.println("Bạn đã rút thành công " + number
                    + "$ vào tài khoản. Số dư mới là " + this.accountBalance + "$");
        } else {
            System.out.println("Don't enough to funds");
        }
    }


    public void showAccount() {
        System.out.println(
                "accountNumber='" + accountNumber + '\'' + "\n" +
                        "accountBalance=' " + accountBalance + "$" + '\'' + "\n" +
                        "customName='" + customName + '\'' + "\n" +
                        "email='" + email + '\'' + "\n" +
                        "phoneNumber='" + phoneNumber + '\'');
    }
}
