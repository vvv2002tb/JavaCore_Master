package OOP.TinhDongGoi_Encapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;


    public void loseHealth(int damege) {
        health = health - damege;
        if (health < 0) {
            System.out.println("Player Die");
        }
    }

    public int remainingHealth() {
        return health;
    }

    public void restoreHealth(int extraHealth) {
        health += extraHealth;
        if (health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }



}
