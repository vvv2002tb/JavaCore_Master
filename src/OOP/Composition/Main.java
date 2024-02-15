package OOP.Composition;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208 Xigmatek", "China", "650W");
        Monitor theMonitor = new Monitor("U2419H", "Dell", 34, "2540 * 1440");
        Motherboard theMotherboard = new Motherboard("Z690", "Asus", 4,
                2, "v14.212");

        PersonalComputer myPc = new PersonalComputer("2208 Xigmatek", "US", theMonitor, theMotherboard, theCase);

//        myPc.getMonitor().drawPixelAt(2,2,"Red");
//        myPc.getMotherboard().loadProgram("Mac OS");
//        myPc.getComputerCase().pressPowerButton();

        myPc.powerUp();

        SmartKitchen myKitchen = new SmartKitchen();
        myKitchen.setKitchenSate(true, true, false);
        myKitchen.doKitchenWork();

    }
}
