package OOP.TinhDongGoi_Encapsulation;

public class PlayerNangCao {
    private String fullName;
    private int health;
    private String weapon;

    public PlayerNangCao(String fullName) {
        this(fullName, 1000, "Sword"); // default moi tao nhan vat
    }

    public PlayerNangCao(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health < 0) {
            this.health = 0;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
        this.weapon = weapon;
    }

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

    @Override
    public String toString() {
        return "PlayerNangCao{" +
                "fullName='" + fullName + '\'' +
                ", health=" + health +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
