public class TestComputer {
    public static void main(String[]args){
        Computer myComputer = new Computer();
        Computer mySecondComputer = new Computer();
        myComputer.displayBrand();
        myComputer.displayColor();
        myComputer.showPrice();
        mySecondComputer.showPrice();
        mySecondComputer.displayColor();
        mySecondComputer.displayBrand();
    }
}
