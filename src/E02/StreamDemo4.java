package E02;

import java.util.Arrays;
import java.util.List;

public class StreamDemo4 {

    public static void main(String[] args) {

        List<Salary> salaries = Arrays.asList(
                new Salary(new Employee(1, "A1"), 111. ),
                new Salary(new Employee(2, "A2"), 211. ),
                new Salary(new Employee(1, "A1"), 311. ),
                new Salary(new Employee(3, "A3"), 141. ),
                new Salary(new Employee(4, "A4"), 415. ),
                new Salary(new Employee(1, "A1"), 451. ),
                new Salary(new Employee(5, "A5"), 165. ),
                new Salary(new Employee(3, "A3"), 564. ),
                new Salary(new Employee(1, "A1"), 4554. ),
                new Salary(new Employee(2, "A2"), 3321. )

        );

        salaries.stream()
                .peek(System.out::println)
                .sorted((s1, s2 ) -> Double.compare(s1.getSalary(), s2.getSalary()))
                .forEach(salary -> System.out.println("Po: " + salary));




    }

}
