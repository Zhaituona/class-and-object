public class Array {
    public static void main(String[] args) {
        int zana[] = new int[6];
        char elzat [] =new char[9];
        String zm[] = new String[8];//array can take many elements but type must be same ,
       // if we want to declare , put the type first then ,array name , the = to the new type []
        //in the [] we can put how many array element we want to put.

       // declare and Initialization
       // primitive type   name of array  []  =  {put the elements can take}
        int hello [] = {6,5,9,86,54};//but index start from zero , so when call hello[1] it
        //will show 5 in the end //
        double carry[] = {3.25,5.24,6.23,9.24};
        String name [] = {"zana","elzat","attila","fionna"};
        System.out.println(hello[3]);//give the element , index is 3 array name the index that will show array element //
        System.out.println(carry[2]);
        System.out.println(name[3]);
    }
}
