package OOP.TinhDongGoi_Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player1 = new Player();
//        player1.name = "Vinh";
//        player1.health = 20;
//        player1.weapon = "Short gun";
//
//        int damage = 10;
//        player1.loseHealth(damage);
//        System.out.println("Remaining health = " + player1.remainingHealth() + "HP");

        PlayerNangCao player1 = new PlayerNangCao("Vinh", 200, "Sword");
        System.out.println(player1);
        System.out.println("Initial health is " + player1.remainingHealth());




    }

}
