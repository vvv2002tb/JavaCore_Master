package OOP.KeThua;

public class Fish extends Animal{
    private int soLuongVay; // vảy cá
    private int soLuongMang; // mang cá

    public Fish(String type, double weight, int soLuongVay, int soLuongMang) {
        super(type, "small", weight);
        this.soLuongVay = soLuongVay;
        this.soLuongMang = soLuongMang;
    }

    // bơi
    private void boi() {
        System.out.println("Cá đang bơi rất nhanh");
    }
    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "fast") {
            boi();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "soLuongVay=" + soLuongVay +
                ", soLuongMang=" + soLuongMang +
                "} " + super.toString();
    }
}
