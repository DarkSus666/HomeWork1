public class EmployeeBook {
    private Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addContact(String employeeName, int employeeDepartment, int employeeSalary, int id) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
        }
        Employee newEmployee = new Employee(employeeName, employeeDepartment, employeeSalary);
        employees[size++] = newEmployee;
    }
}
