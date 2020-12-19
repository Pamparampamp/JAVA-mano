package E02;

import java.util.Objects;

public class Salary {
        private Employee employee;
        private Double salary;

    public Salary(Employee employee, Double salary) {
        this.employee = employee;
        this.salary = salary;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "employee=" + employee +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salary salary1 = (Salary) o;
        return Objects.equals(employee, salary1.employee) &&
                Objects.equals(salary, salary1.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, salary);
    }
}
