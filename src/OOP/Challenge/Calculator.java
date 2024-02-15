package OOP.Challenge;

public class Calculator {
    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
       return this.floor.getAre() * this.carpet.getCost();
    }
}
