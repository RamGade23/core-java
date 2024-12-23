package collection.comparable;

class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private double salary;

    //sort by name ascending order
    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }

    //sort by name and salary
/*    @Override
    public int compareTo(Employee o) {
        //Sorting basis on name ascending order
        int nameCompare = this.getName().compareTo(o.getName());

        //if names are same then sorting basis on salary descending order
        if (nameCompare == 0) {
            return (int) (o.getSalary() - this.getSalary());
        }

        return nameCompare;
    }*/

    //sort by name descending order
/*    @Override
    public int compareTo(Employee o) {
        return o.getName().compareTo(this.getName());
    }*/

    //sort by id ascending order
/*    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.getId(), o.getId());
        // return this.getId() - o.getId();
    }*/

    //sort by id descending order
/*    @Override
    public int compareTo(Employee o) {
        return Integer.compare(o.getId(), this.getId());
        //return o.getId() - this.getId();
    }*/

    //sort by id ascending salary
/*    @Override
    public int compareTo(Employee o) {
        return (int) (this.getSalary() - o.getSalary());
    }*/

    //sort by id descending salary
/*    @Override
    public int compareTo(Employee o) {
        return Double.compare(o.getSalary(), this.getSalary());
        //return (int) (o.getSalary() - this.getSalary());
    }*/


    //Contractor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
