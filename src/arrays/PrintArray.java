package arrays;

public class PrintArray {

    public static void main(String[] args) {
        printArray();
    }

    //print Array
    public static void printArray() {
        int[] array = {3, 2, 6, 5, 1, 6, 3, 8};//8

        //print an array
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            System.out.print(a + " ");
        }
        System.out.println("\n print using for each");
        for (int ele : array) {
            System.out.print(ele + " ");
        }
        System.out.println();

        String[] str = {"Snehal", "Rahul", "Akash", "Priya", "Vivek"};
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }

        System.out.println("\n print using for each");
        for (String s : str) {
            System.out.print(s+" ");
        }

    }
}
