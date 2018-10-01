import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random ran1 = new Random();
        int number ;

        for(int counter = 1; counter <= 10; counter++);
        number = ran1.nextInt(6);
        System.out.println(number + " ");


    }
}
