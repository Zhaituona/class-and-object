import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in );
        int total = 0;
        int grade;
        int average;
        int counter = 0;

        while(counter < 10){
            grade = scan1.nextInt();
            total = total + grade;
           counter ++;
        }
        average = total / 10;
        System.out.println("Student's average grade is " + average);

        if(average < 5) {
            System.out.println("great");
        }
        else{
            System.out.println("non");
        }




    }
}
