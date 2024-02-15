package OOP;

public class CustomerTest {
    public static void main(String[] args) {
        Customer ctm1 = new Customer();
        Customer ctm2 = new Customer("Đoàn Trọng Vinh", "clonevinh95@gmail.com");
        Customer ctm3 = new Customer("John Smith", 100,  "johnsmith@gmail.com");

        System.out.println(ctm1.toString());
        System.out.println(ctm2.toString());
        System.out.println(ctm3.toString());

    }
}
