import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class SortByAgeAndSalary {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 70000));
        employees.add(new Employee("Bob", 25, 50000));
        employees.add(new Employee("Charlie", 35, 60000));
        employees.add(new Employee("David", 28, 80000));

        // Sort by age
        Collections.sort(employees, (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        
        System.out.println("Sorted by age:");
        employees.forEach(System.out::println);

        // Sort by salary
        Collections.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        
        System.out.println("\nSorted by salary:");
        employees.forEach(System.out::println);
    }
}
