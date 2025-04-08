public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();


        employeeBook.addEmployee("Ivanov Ivan Ivanovich", 3, 20000);
        employeeBook.addEmployee("Ivanov Andrey Ivanovich", 2, 55555);
        employeeBook.addEmployee("Ivanov Ivan Vasilievich", 1, 35000);
        employeeBook.addEmployee("Ivanov Ivan Vasilievich", 1, 35000);
        employeeBook.addEmployee("Ivanov Ivan Vasilievich", 1, 35000);
        employeeBook.addEmployee("Ivanov Ivan Vasilievich", 1, 35000);
        employeeBook.addEmployee("Ivanov Ivan Vasilievich", 1, 35000);
        employeeBook.addEmployee("Ivanov Ivan Vasilievich", 1, 35000);
        employeeBook.addEmployee("Ivanov Ivan Vasilievich", 1, 35000);
        employeeBook.addEmployee("Ivanov Ivan Vasilievich", 1, 35000);
        employeeBook.deleteEmployeeById(30);
        employeeBook.addEmployee("Ivanov Ivan Vasilievich", 1, 35000);
        employeeBook.addEmployee("Ivanov Ivan Vasilievich", 1, 35000);
        employeeBook.addEmployee("Antonov Ivan Nikolaevich", 1, 70700);
        employeeBook.indexSalary(5);
        employeeBook.indexSalaryInDepartment(1, 10);
        employeeBook.showAllEmployees();
        System.out.println();
        System.out.println("Общие затраты компании на зарплату : " + employeeBook.countAllSalary() + " руб.");
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.searchMinSalaryEmployee());
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook.searchMaxSalaryEmployee());
        employeeBook.showAllNamesOfEmployees();
        System.out.println();
        System.out.println("Средняя зарплата в компании: " + employeeBook.countAverageSalary() + " руб.");
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой в 1 отделе: " + employeeBook.searchMinSalaryEmployeeInDepartment(1));
        System.out.println("Сотрудник с максимальной зарплатой в 3 отделе: " + employeeBook.searchMaxSalaryEmployeeInDepartment(3));
        System.out.println("Общие затраты на зарплаты в 7 отделе: " + employeeBook.countAllSalaryInDepartment(7) + "руб.");
        System.out.println("Средняя зарплата по 2 отделу: " + employeeBook.countAverageSalaryInDepartment(2) + " руб.");
        System.out.println();
        employeeBook.showAllEmployeesInDepartment(4);
        System.out.println();
        employeeBook.searchEmployeeMoreThan(30000);
        System.out.println();
        employeeBook.searchEmployeeLessThan(30000);
        employeeBook.searchEmployeeById(7);


    }


}