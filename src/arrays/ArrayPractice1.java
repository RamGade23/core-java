package arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {
        //multiplication1();
        //squareOfElement();
        //printCube();
        //printLargestElement();
        printMinElement();
    }

    //WAP to get multiplication of all elements from given array
    public static void multiplication() {
        int[] array = {5, 3, 6, 2, 3, 7, 4, 89};

        int output = 1;//5*3*6*2*3

        for (int i = 0; i < array.length; i++) {//i=0,1,2,3,4,5
            output = output * array[i];
        }
        System.out.println("Multiplication is : " + output);

    }

    //WAP to square each element of an array.
    public static void squareOfElement() {
        int[] intArray = {5, 3, 6, 2};//4

        for (int i = 0; i < intArray.length; i++) {//i=0,1
            intArray[i] = intArray[i] * intArray[i];
        }

        //Print an array
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }
    }

    //WAP to multiply each element by 10 and print an array
    public static void multiplication1() {
        int[] intArray = {5, 3, 6, 2, 1};//4
        //5 = 5*5*5
        for (int i = 0; i < intArray.length; i++) {//i=0,1,2
            intArray[i] = intArray[i] * 10;
        }

        //Print an array
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }
    }

    //WAP to multiply each element by 10 and print an array
    public static void printCube() {
        int[] intArray = {5, 3, 6, 2, 1};//4
        //5 = 5*5*5
        for (int i = 0; i < intArray.length; i++) {//i=0,1,2
            intArray[i] = intArray[i] * intArray[i] * intArray[i];
        }

        //Print an array
        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1) {
                System.out.print(intArray[i] + ".");
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }
    }

    //Find the Largest Element in an Array
    public static void printLargestElement() {
        int[] intArray = {5, 3, 6, 2, 1, 9};

        int max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {

            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        System.out.println("Largest number is : " + max);
    }

    //Find the min Element in an Array
    public static void printMinElement() {
        int[] intArray = {5, 3, 6, 2, 1, 9};

        int min = intArray[0]; //5
        for (int i = 1; i < intArray.length; i++) {

            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        System.out.println("Largest number is : " + min);
    }

}
