public class Main {
    public static void main(String[] args) {

        employees[0] = new Employee("Ivanov Ivan Ivanovich", 3, 20000);
        employees[1] = new Employee("Ivanov Andrey Ivanovich", 2, 55555);
        employees[2] = new Employee("Ivanov Ivan Vasilievich", 1, 35000);
        employees[3] = new Employee("Antonov Ivan Nikolaevich", 1, 70700);
        indexSalary(5);
        indexSalaryInDepartment(1, 10);
        showAllEmployees();
        System.out.println();
        System.out.println("Общие затраты на зарплаты: " + countAllSalary() + " руб.");
        System.out.println("Сотрудник с минимальной зарплатой: " + searchMinSalaryEmployee());
        System.out.println("Сотрудник с максимальной зарплатой: " + searchMaxSalaryEmployee());
        showAllNamesOfEmployees();
        employees[3].setDepartment(4);
        System.out.println();
        System.out.println("Средняя зарплата: " + countAverageSalary() + " руб.");
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой в 1 отделе: " + searchMinSalaryEmployeeInDepartment(1));
        System.out.println("Сотрудник с максимальной зарплатой в 3 отделе: " + searchMaxSalaryEmployeeInDepartment(3));
        System.out.println("Общие затраты на зарплаты в 7 отделе: " + countAllSalaryInDepartment(7) + "руб.");
        System.out.println("Средняя зарплата по 2 отделу: " + countAverageSalaryInDepartment(2) + " руб.");
        System.out.println();
        showAllEmployeesInDepartment(4);
        System.out.println();;
        searchEmployeeMoreThan(30000);
        System.out.println();
        searchEmployeeLessThan(30000);


    }


}