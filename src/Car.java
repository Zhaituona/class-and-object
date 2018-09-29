public class Car {
    int price = 5000;
    String color = "blue";
    String brand = "Toyota";
    String make = "Matrix";
    public void runCar(){
        System.out.println("Run the car");
    }
    public void stopCar(){
        System.out.println("Stop the car");

    }
    public int getPrice(){
        int price = 5000;
        return price ;
    }
    public String getColor(){
        String color = "blue";
        return "blue";
    }
    public String getString(String color, String brand ){
        String getString = "blue + Toyota";
        return getString;
    }

    public Car(){

    }
    public Car(int price,String color){
        this.price = price;
        this.color = color;
        System.out.println(price + color);

    }
    public Car(int price, String color, String brand){
        this.price = price;
        this.color= color;
        this.brand = brand;
        System.out.println(price + color + brand);

    }
    public Car(int price , String color , String brand, String make){
        this.price = price;
        this.color = color;
        this.brand = brand;
        this.make = make;
        System.out.println(price + color + brand + make);
    }
}
