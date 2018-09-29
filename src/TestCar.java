public class TestCar {
    public static void main(String[]args){
        Car myCar = new Car();
        Car myCar2 = new Car(5000,"blue");
        int result = myCar2.price;
        System.out.println(result);
        Car myCar3 = new Car(5000,"blue","Toyota");
        String string = myCar3.getString("blue" , "Toyota");
        System.out.println("My third car can run");
        Car myCar4 = new Car(5000,"blue","Toyota","Matrix");

        myCar.runCar();
        myCar.stopCar();
        myCar.getPrice();
        myCar2.getColor(); myCar2.getPrice();
        myCar3.getString("blue" , "Toyota");



    }
}
