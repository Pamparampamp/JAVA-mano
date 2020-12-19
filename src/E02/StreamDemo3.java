package E02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo3 {

    public static void main(String[] args) {


        List<Salary>  salaries = Arrays.asList(
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


        //UŽDAVINYS
        //Tarkime turime objektą Employee ir objektą Salary, kuriame yra Employee tipo
        //laukas ir Double tipo laukas reiškiantis išmokėtą atlyginimą.
        //Sukurkite sąrašą darbuotojų ir jų atlyginimų (gali būti keli to pačio darbuotojo įrašai)
        //ir aprašykite tokius veiksmus naudojant duomenų srautus/vamzdynus:
        //1. Išrinkite kiek ir kokiam darbuotojui yra išmokėta ir išveskite mažėjimo tvarka
        //pagal išmokėtą sumą: vardas - išmokėta suma

        salaries.stream()
//                .sorted((d1, d2) -> {
//                    if (d1.getSalary() < d2.getSalary()) return 1;
//                    else if (d1.getSalary() > d2.getSalary()) return -1;
//                    else return 0;
//                })
                .sorted((d1, d2) -> -Double.compare(d1.getSalary(), d2.getSalary()))
                .forEach(d -> System.out.println(d.getEmployee().getName() + " " +
                        d.getSalary()));



        //2. Suskaičiuokite kiek išmokėjimų (ne suma bet kiek kartų buvo išmokėta) yra
        //kiekvienam darbuotojui ir atspausdinkite: vardas - kiek kartų išmokėta  ir isvesti mazejimo tvarka

    Map<Employee, List<Salary>> map = salaries.stream()
            .collect(Collectors.groupingBy(s -> s.getEmployee()));
        System.out.println(map);

        Map<Employee, Double> map2 = salaries.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getEmployee(),
                        Collectors.reducing(0.0,(Salary s) -> s.getSalary(), (x , y) -> x + y )));
        System.out.println(map2);







    }
}
