public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();


        System.out.println("Добавлен сотрудник " + employeeBook.addEmployee("Ivanov Ivan Ivanovich", 3, 20000));
        System.out.println("Добавлен сотрудник " + employeeBook.addEmployee("Ivanov Andrey Ivanovich", 2, 55555));
        System.out.println("Добавлен сотрудник " + employeeBook.addEmployee("Ivanov Ivan Vasilievich", 1, 35800));
        System.out.println("Добавлен сотрудник " + employeeBook.addEmployee("Ivanov Ivan Vasilievich", 3, 15000));
        System.out.println("Добавлен сотрудник " + employeeBook.addEmployee("Ivanov Ivan Vasilievich", 5, 35060));
        System.out.println("Добавлен сотрудник " + employeeBook.addEmployee("Kotov Ivan Vasilievich", 4, 27000));
        System.out.println("Добавлен сотрудник " + employeeBook.addEmployee("Ivanov Ivan Vasilievich", 1, 35000));
        System.out.println("Добавлен сотрудник " + employeeBook.addEmployee("Ivanov Anton Vasilievich", 2, 68000));
        System.out.println("Добавлен сотрудник " + employeeBook.addEmployee("Ivanov Ivan Vasilievich", 1, 35000));
        System.out.println("Добавлен сотрудник " + employeeBook.addEmployee("Sobakin Ivan Vasilievich", 3, 43000));
        System.out.println("Добавлен сотрудник " + employeeBook.addEmployee("Ivanov Ivan Vasilievich", 4, 13000));
        System.out.println("Добавлен сотрудник " + employeeBook.addEmployee("Ivanov Victor Vasilievich", 1, 35000));
        System.out.println("Удален сотрудник " + employeeBook.deleteEmployeeById(3));
        System.out.println("Удален сотрудник " + employeeBook.deleteEmployeeById(16));
        System.out.println("Добавлен сотрудник " + employeeBook.addEmployee("Pirogov Ivan Vasilievich", 4, 60000));
        System.out.println("Добавлен сотрудник " + employeeBook.addEmployee("Ivanov Ivan Vasilievich", 4, 98000));
        System.out.println("Добавлен сотрудник " + employeeBook.addEmployee("Antonov Ivan Nikolaevich", 1, 70700));
        System.out.println();
        employeeBook.indexSalary(5);
        employeeBook.indexSalaryInDepartment(1, 10);
        System.out.println();
        employeeBook.showAllEmployees();
        System.out.println();
        System.out.println("Общие затраты компании на зарплату : " + employeeBook.countAllSalary() + " руб.");
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.searchMinSalaryEmployee());
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook.searchMaxSalaryEmployee());
        System.out.println();
        employeeBook.showAllNamesOfEmployees();
        System.out.println();
        System.out.println("Средняя зарплата в компании: " + employeeBook.countAverageSalary() + " руб.");
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой в 1 отделе: " + employeeBook.searchMinSalaryEmployeeInDepartment(1));
        System.out.println("Сотрудник с максимальной зарплатой в 4 отделе: " + employeeBook.searchMaxSalaryEmployeeInDepartment(4));
        System.out.println();
        System.out.println("Общие затраты на зарплаты в 3 отделе: " + employeeBook.countAllSalaryInDepartment(3) + "руб.");
        System.out.println();
        System.out.println("Средняя зарплата по 2 отделу: " + employeeBook.countAverageSalaryInDepartment(2) + " руб.");
        System.out.println();
        employeeBook.showAllEmployeesInDepartment(4);
        System.out.println();
        employeeBook.searchEmployeeMoreThan(30000);
        System.out.println();
        employeeBook.searchEmployeeLessThan(30000);
        System.out.println();
        employeeBook.searchEmployeeById(7);
        System.out.println();
        System.out.println(employeeBook.searchEmployeeById(10));
        System.out.println(employeeBook.searchEmployeeById(7));
        System.out.println("employeeBook.searchEmployeeById(6) = " + employeeBook.searchEmployeeById(6));
    }
}