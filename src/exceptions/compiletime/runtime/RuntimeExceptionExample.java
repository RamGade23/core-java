package exceptions.compiletime.runtime;

import collection.comparator.Employee;

public class RuntimeExceptionExample {
    public static void main(String[] args) {

        //ArithmeticException
        //int a = 3 / 0;

        //NullPointerException
        /*String a = "Rahul";
        a = null;
        boolean ans = a.startsWith("c");
        System.out.println(ans);*/

        /*Employee emp = new Employee("Ashwini", 1, 450000);
        System.out.println("name : " + emp.getName());
        emp = null;
        System.out.println("name1 : " + emp.getName());*/

        //ArrayIndexOutOfBoundsException
        int[] arr = {1, 3, 5};
        System.out.println(arr[5]);
    }
}
