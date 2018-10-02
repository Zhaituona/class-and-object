public class ArrayTable {
    public static void main(String[] args) {
        System.out.println("Index\tValue");

        int ar1 [] = {1,23,12,20,56,86,97};
        for(int count = 0; count < ar1.length-1; count++){
            //ar1.length it will take the length of the array //
            System.out.println(count + "\t" + ar1[count]);
        }
    }
}
