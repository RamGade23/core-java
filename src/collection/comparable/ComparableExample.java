package collection.comparable;

import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 2, 50000));
        employees.add(new Employee("Rohan", 1, 10000));
        employees.add(new Employee("Alice", 3, 30000));
        employees.add(new Employee("Sam", 4, 20000));
        employees.add(new Employee("John", 5, 40000));

        System.out.println("Before sorting by name");
        printList(employees);

        //1. Sort employee list basis on the name ascending/descending order
        Collections.sort(employees);
        System.out.println("After sorting by name");
        printList(employees);

        //2. Sort employee list basis on the ID ascending/descending
        /*Collections.sort(employees);
        System.out.println("After sorting by id");
        printList(employees);*/

        //3. Sort employee list basis on the salary ascending/descending
/*        Collections.sort(employees);
        Collections.sort(employees, Collections.reverseOrder());
        System.out.println("After sorting by salary");
        printList(employees);*/


        //4. Sort employee list basis on the name and salary.
 /*       Collections.sort(employees);
        System.out.println("After sorting by name and salary");
        printList(employees);*/

        //Wen give input is in the set
        Set<Employee> employeesSet = new HashSet<>();
        employeesSet.add(new Employee("John", 2, 50000));
        employeesSet.add(new Employee("Rohan", 1, 10000));
        employeesSet.add(new Employee("Alice", 3, 30000));
        employeesSet.add(new Employee("Sam", 4, 20000));
        employeesSet.add(new Employee("John", 5, 40000));

        // Convert HashSet to List for sorting
        List<Employee> employeeList = new ArrayList<Employee>(employeesSet);

        System.out.println("Before sorting employeesSet");
        printList(employeeList);

        //1. Sort employee set basis on the name ascending/descending order
        Collections.sort(employeeList);
        System.out.println("After sorting employeesSet by name");
        printList(employeeList);

    }

    public static void printList(List<Employee> employees) {
        for (Employee emp : employees){
            System.out.println(emp.toString());
        }
    }
}
