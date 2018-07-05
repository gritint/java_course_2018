package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainSorting {

    public static void main(String[] args) {
            MainSorting p = new MainSorting();
            p.start();
    }

    private void start() {
        // create data
        List<Employee> employees = intialData();
        employees.forEach(System.out::println);
        
        // Sorting with Comparator
//        Collections.sort(employees, new SortingBySalaryWithDecending());
        Comparator<Employee> withLambda =
                (Employee e1, Employee e2) ->
                    (int)(e2.getSalary() - e1.getSalary());
                    Collections.sort(employees, withLambda);
        employees.forEach(System.out::println);
     }

    private List<Employee> intialData() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Somkiat", 200));
        employees.add(new Employee(2, "Pui", 100));
        employees.add(new Employee(3, "Abdul", 500));
        return employees;
    }
    
    class SortingBySalaryWithDecending implements Comparator<Employee> {

        @Override
        public int compare(Employee e1, Employee e2) {
       
            return (int)(e2.getSalary() - e1.getSalary());
        }
        
    }
}
