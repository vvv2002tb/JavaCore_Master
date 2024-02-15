package OOP.TinhDongGoi_Encapsulation;

public class TestPrint {
    public static void main(String[] args) {
        Printer printerMachine = new Printer(0, true);
        printerMachine.addToner(40);
        printerMachine.printPages(5);
        System.out.println(printerMachine.getPagesPrinted());


        System.out.println(printerMachine);
    }
}
