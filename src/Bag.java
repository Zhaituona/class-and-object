public class Bag {
    int price = 300;
    String brand = "MK";
    String color = "Pink";
    public Bag(String brand){
        this.brand= brand;
        System.out.println(brand);

    }
    public Bag(int price){
        this.price = price;
        System.out.println(price);

    }
    public Bag(String color, int price){
        this.color= color;
        this.price =price;
        System.out.println(color + price);
    }
    public Bag(){

    }
}
