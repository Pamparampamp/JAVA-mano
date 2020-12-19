package E01.Uzdavinys2;
//15 skairdres uzdavinys

public class Main {

    public static void main(String[] args) {

        Container<Employee> box = new Container<>();

        box.add(new Employee("B"));
        box.add(new Employee("C"));
        box.add(new Employee("A"));

        for (Employee emp : box.order((e1, e2) -> -e1.getName().compareTo(e2.getName()))) {
            System.out.println(emp);
        }

    }
}
