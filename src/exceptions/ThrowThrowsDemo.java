package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowThrowsDemo {
    public static void main(String[] args) throws Exception {
        //int result = addNumbers(4, -1);
        //int result = divideNmbers(4, 1);
        //System.out.println("result : " + result);

        String result1 = findLastName("x y z");
        System.out.println("result1 : " + result1);
        //readFile();
    }

    public static int addNumbers(int a, int b) {

        if (a < 0 || b < 0) {
            throw new NegativeNumberException("Input arguments are negative");
        }
        int c = a + b;
        return c;
    }

    private static int divideNmbers(int a, int b) {

        if (b <= 0) {
            throw new ArithmeticException("b is negative or zero");
        }
        int c = a / b;
        return c;
    }

    private static String findLastName(String name) throws InvalidNamesException/*, Exception*/ {
/*        try {
            if (name == null) {
                throw new InvalidNamesException("input name is null");
            }
        } catch (InvalidNamesException ie) {
            System.out.println("Exception at line 39 in method findLastName, message : " + ie.getMessage());
        }*/

        if (name == null) {
            throw new InvalidNamesException("input name is null");
        }

        String[] strArr = name.split(" "); //["Rahul", "Gandhi"]; //["Rahul"]

        /*if (strArr.length == 1) {
            throw new Exception("please pass full name");
        }*/
        return strArr[strArr.length-1];
    }

    private static void readFile() throws FileNotFoundException {
        File file = new File("E://file.txt");
        FileReader file1 = new FileReader(file); // Checked //exception
    }

}

//addNumbers method can accept only positive numbers.
// in case of negative numbers it should throw an exception