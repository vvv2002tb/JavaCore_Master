package OOP;

public class ClassChallenge {
    public static void main(String[] args) {
        AccountBanking user1 = new AccountBanking();
        user1.setAccountBalance(1000);
        user1.setAccountNumber("0211000513102");
        user1.setEmail("clonevinh95@gmail.com");
        user1.setCustomName("Doan Trong Vinh");
        user1.setPhoneNumber("0961907512");

        user1.showAccount();
        user1.addBalanceToAccount(1000);
        user1.fundBalanceToAccount(500);


        AccountBanking user2 = new AccountBanking("999999999", 2000, "Nguyen Thu Trang", "trangnt02@gmail.com",
                "0941524511");

        user2.showAccount();


        AccountBanking user3 = new AccountBanking();
        user3.showAccount();







    }
}
