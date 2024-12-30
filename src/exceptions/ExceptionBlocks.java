package exceptions;

import oops.Employee;

import java.sql.Connection;

public class ExceptionBlocks {
    public static void main(String[] args) {

        //division code
        int a = 10;
        System.out.println("line 7");
        int b = 1;
        System.out.println("line 9");
        try {
            int c = a / b;
            System.out.println("division : " + c);
            int[] arr = {1, 3, 4};
            int out = arr[1];
            String str1 = null;
            str1.trim();
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("ArrayIndexOutOfBoundsException : " + ai.getMessage());
        } catch (ArithmeticException a1) {
            System.out.println("ArithmeticException : " + a1.getMessage());
        } catch (Exception e3) {
            System.out.println("exception " + e3.getMessage());
        } finally {
            System.out.println("this is finally block one");
        }
        System.out.println("line 17");

        try {
            Employee employee = new Employee();
            //employee = null;
            employee.msg();
        } catch (Exception e) {
            System.out.println("exception : " + e.getMessage());
        } finally {
            System.out.println("this is finally block");
        }

        //sum
        int d = a + b;
        System.out.println("sum : " + d);


    }
}
