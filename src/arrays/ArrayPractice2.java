package arrays;

import java.math.BigDecimal;
import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {
        //swapNumbers();
        //mergeArray();
        //sortByAscending();

        arraySumCount();
    }


    //Wap to sort an array in ascending order.
    public static void sortByAscending() {
        int[] a = {8, 5, 1, 2, 8, 4};
        for (int i = 0; i < a.length; i++) {//i=0,1,2,3,4
            for (int j = 1 + i; j < a.length; j++) {//i=0, j=4
                int temp = a[i];//8
                if (temp > a[j]) { //5
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            //{1,2,4,5,8}
        }
        //Print array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        //min and max element
        System.out.println();
        System.out.println("max ele from given array : " + a[a.length - 1]);
        System.out.println("min ele from given array : " + a[0]);

        //Wap enter an array and find the second max element.
        System.out.println("second max element : " + a[a.length - 2]);
        System.out.println("third max element : " + a[a.length - 3]);

        System.out.println("second min element : " + a[1]);

    }

    public static void swapNumbers() {
        int a = 5;
        int b = 6;
        System.out.println("before swapping : " + a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping : " + a + " " + b);
        b = a + b; //b = 11, a = 6;
        a = b - a; // a = 6
        b = b - a; // b = 5
        System.out.println("after swapping : " + a + " " + b);
    }

    //WAP to merge two Array and print the final array.
    public static void mergeArray() {
        int[] a = {1, 2, 3, 4, 5}; //5
        int[] b = {6, 7, 8, 9, 10}; //5

        //step 1 = declare new array with expected length
        int[] output = new int[10]; // {1,2,3,4,5,6,7,8,9,10}

        //step 2 = merge first array into output array
        for (int i = 0; i < a.length; i++) {//i=0,1,2,3,4,5
            output[i] = a[i];
        }
        //step 3 = merge second array into output array
        for (int i = 0; i < b.length; i++) {//i=0,1,2,3,4
            output[i + a.length] = b[i];//9,10
        }
        //step 4 = print an output array
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }

    //Wap to find the sum of elements present at an even position

    public static void arraySumCount() {
        int[] array = {2, 5, 1, 4, 8, 3, 9};
        //sum of ele present at even index = 20
        int sum = 0; //0+2+1+8+9
        for (int i = 0; i < array.length; i = i + 2) {//i=0,2,4,6
            sum = sum + array[i];
        }
        System.out.println("sum of ele present at even index : " + sum);

        //sum of ele present at odd index = 12
        int oddSum = 0; //0+2+1+8+9
        for (int i = 1; i < array.length; i = i + 2) {//i=0,2,4,6
            oddSum = oddSum + array[i];
        }
        System.out.println("sum of ele present at odd index : " + oddSum);
    }

}
