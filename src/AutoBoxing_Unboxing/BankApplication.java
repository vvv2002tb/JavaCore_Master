package AutoBoxing_Unboxing;
import java.util.ArrayList;

public class BankApplication {
    public static void main(String[] args) {

    }
}

class Bank extends Branch{
    private String name;
    private ArrayList<Branch> branches = new ArrayList<>(100);

    public Bank(String name, String name1, ArrayList<Branch> branches) {
        super(name);
        this.name = name1;
        this.branches = branches;
    }

    public boolean addBranch(String branch) {
        for (var branchName : branches
             ) {
            if (branchName.getName().equals(branch)) {
                return false;
            }

        }

        branches.add(new Branch(branch));
        return true;
    }

    public boolean addCustomer(String nameBranch, String nameCustomer, double initialTransaction) {
        for (var branch : branches
             ) {
            if (branch.getName().equals(nameBranch)) {
                branch.addCustomerTransaction(nameCustomer, initialTransaction);
                return true;
            }
        }
        return false;
    }
}


class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction) {
        for (var customer : customers
        ) {
            if (customer.getName().equals(name)) {
                return false;
            }
        }
        Customer customer = new Customer(name, initialTransaction);
        customers.add(customer);
        if (customers.contains(customer)) {
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameCustomer, double amount) {
        for (var customer : customers) {
            if (customer.getName().equals(nameCustomer)) {
                customer.transactions.add(amount);
                return true;
            }
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for (var customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}

class Customer {
    private String name;
    ArrayList<Double> transactions = new ArrayList<>(500);


    public Customer(String name, double initialDeposit) {
        this.name = name;
        transactions.add(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void getTransactions(double transaction) {

    }


}


