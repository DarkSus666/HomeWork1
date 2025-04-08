
import java.util.Objects;

public class Employee {
    private static int idCount = 1;
    private String name;
    private int department;
    private double salary;
    private int id;



    public Employee (String name, int department, int salary) {
        this.name = name;
        if (department <= 0 || department >5) {
            throw new IllegalArgumentException("Отдел может быть от 1 до 5");
        }
        this.department = department;
        this.salary = salary;
        this.id = idCount++;
    }

    public static int getIdCount() {
        return idCount;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        if (department <= 0 || department >5) {
            throw new IllegalArgumentException("Отдел может быть от 1 до 5");
        }
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }

    @Override
    public String toString() {
        return "ID " + id + ", " + name +
                ", отдел №" + department +
                ", зарплата: " + salary + " руб.";
    }
}
