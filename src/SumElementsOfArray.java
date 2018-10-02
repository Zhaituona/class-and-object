public class SumElementsOfArray {
    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5,6};
        int sum = 0;
        double average = 0 ;
        for(int count = 0; count < array1.length; count++){
            sum +=  array1[count];//this is sum of the array of the elements//
            average = sum/ array1.length ;// this is average of the array elements //
        }
        System.out.println("the average is " + " " + average);
        System.out.println("the sum is " + " " + sum);

    }
}
