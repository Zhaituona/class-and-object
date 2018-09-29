import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int salary;
        int average;
        int counter = 0;

        while (counter < 10){
            salary = input.nextInt();
            total = total +salary;
            counter ++;
        }
        average = total /10;
        System.out.println("Employee's average salary is " + average);

    }

}
