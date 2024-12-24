package collection.comparator;

import java.util.*;

public class EmployeeSortingExample {
    public static void main(String[] args) {
        // Create a HashSet of Employee objects
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee("John", 101, 60000));
        employeeSet.add(new Employee("Bob", 103, 55000));
        employeeSet.add(new Employee("Smith", 101, 45000));
        employeeSet.add(new Employee("Rock", 105, 80000));
        employeeSet.add(new Employee("Charlie", 104, 70000));

        // Convert HashSet to List for sorting
        List<Employee> employeeList = new ArrayList<>(employeeSet);

        // Sort by Name
        //Collections.sort(employeeList, new NameComparator());

        //1. Using an Anonymous Class:
        /*Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e2.getName().compareTo(e1.getName());
            }
        });*/

        //2. Using a Lambda Expression:
        //employeeList.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));

        //3. Using Comparator.comparing:
        //employeeList.sort(Comparator.comparing(Employee::getName).reversed());

        //4. Using Stream API for Sorted Output (Not Modifying Original List):
        //List<Employee> sortedList = employeeList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).toList();

        //5. Chained Comparisons (e.g., by name and then id if names are equal):
        //employeeList.sort(Comparator.comparing(Employee::getName).thenComparingInt(Employee::getId).reversed());

        System.out.println("Sorted by Name:");
        printList(employeeList);


        // Sort by ID
        //Collections.sort(employeeList, new IdComparator());

        //1. Using an Anonymous Class:
/*        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int idCompare = Integer.compare(e1.getId(), e2.getId());
                if (idCompare == 0) {
                    return e2.getName().compareTo(e1.getName());
                }
                return idCompare;
            }
        });*/

        //2. Using a Lambda Expression:
/*        employeeList.sort((e1, e2) -> {
            int idCompare = Integer.compare(e1.getId(), e2.getId());
            if (idCompare == 0) {
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
            return idCompare;
        });*/

        //3. Using Comparator.comparing:
        //employeeList.sort(Comparator.comparingInt(Employee::getId));
        //employeeList.sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        //4. Using Stream API for Sorted Output (Not Modifying Original List):
        //List<Employee> sortedList = employeeList.stream().sorted(Comparator.comparingInt(Employee::getId).reversed()).toList();

        System.out.println("Sorted by Id:");
        printList(employeeList);


        // Filter employees with salary > 50k
        /*System.out.println("Employees with salary > 50k:");
        for (Employee e : employeeSet) {
            if (e.getSalary() > 50000) {
                System.out.println(e);
            }
        }*/
    }

    private static void printList(List<Employee> list) {
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
