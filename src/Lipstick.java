public class Lipstick {
    int price = 20;
    String brand = "MAC";
    String color = "red";
    String style = "Matte";

    public Lipstick(){

    }
    public Lipstick(int price , String color){
        this.price = price;
        this.color= color;
        System.out.println(price + " " +  color);
    }
    public Lipstick(int price){
        this.price = price;
        System.out.println(price);



    }
    public Lipstick(int price , String color, String style){
        this .price = price;
        this.color = color;
        this.style= style;
        System.out.println(price + " " +  color + " " + style);

    }
}
