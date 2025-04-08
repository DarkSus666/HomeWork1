public class Main {
    private static Employee[] employees = new Employee[10];

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

    public static void showAllEmployees() {
        int count = 0;
        System.out.println("Сотрудники компании:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("В компании нет сотрудников");
        }
    }

    public static double countAllSalary() {
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public static String searchMinSalaryEmployee() {
        double salary = 10000000;
        Employee min = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() <= salary) {
                    salary = employee.getSalary();
                    min = employee;
                }
            }
        }
        if (min == null) {
            return "В компании нет сотрудников";
        } else {
            return min.getName();
        }
    }

    public static String searchMaxSalaryEmployee() {
        double salary = 0;
        Employee max = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() >= salary) {
                    salary = employee.getSalary();
                    max = employee;
                }
            }
        }
        if (max == null) {
            return "В компании нет сотрудников";
        } else {
            return max.getName();
        }
    }

    public static double countAverageSalary() {
        double total = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
                count++;
            }
        }
        return total / count;
    }

    public static void showAllNamesOfEmployees() {
        System.out.println("ФИО сотрудников компании:");
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("В компании нет сотрудников");
        }
    }

    public static void indexSalary(int index) {
        for (Employee employee : employees) {
            if (employee != null) {
                double newSalary = employee.getSalary() + employee.getSalary() * index / 100;
                employee.setSalary(newSalary);
            }
        }
    }

    public static String searchMinSalaryEmployeeInDepartment(int department) {

        double salary = 10000000;
        Employee min = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (employee.getSalary() <= salary) {
                    salary = employee.getSalary();
                    min = employee;
                }
            }
        }
        if (min == null) {
            return "В " + department + " отделе нет сотрудников";
        } else {
            return min.getName();
        }
    }

    public static String searchMaxSalaryEmployeeInDepartment(int department) {
        double salary = 0;
        Employee max = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (employee.getSalary() >= salary) {
                    salary = employee.getSalary();
                    max = employee;
                }
            }
        }
        if (max == null) {
            return "В " + department + " отделе нет сотрудников";
        } else {
            return max.getName();
        }
    }

    public static double countAllSalaryInDepartment(int department) {
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public static double countAverageSalaryInDepartment(int department) {
        double total = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                total += employee.getSalary();
                count++;
            }
        }
        return total / count;
    }

    public static void indexSalaryInDepartment(int department, int index) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double newSalary = employee.getSalary() + employee.getSalary() * index / 100;
                employee.setSalary(newSalary);
            }
        }
    }

    public static void showAllEmployeesInDepartment(int department) {
        int count = 0;
        System.out.println("Сотрудники " + department + " отдела:");
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("ID " + employee.getId() + ", " + employee.getName() + ", зарплата: " + employee.getSalary() + " руб.");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("В " + department + " отделе нет сотрудников");
        }
    }

    public static void searchEmployeeLessThan(double salary) {
        int count = 0;
        System.out.println("Сотрудники с зарплатой меньше " + salary + " рублей:");
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < salary) {
                    System.out.println("ID " + employee.getId() + ", " + employee.getName() + ", зарплата: " + employee.getSalary() + " руб.");
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("В компании нет сотрудников с зарплатой ниже " + salary + " руб.");
        }
    }

    public static void searchEmployeeMoreThan(double salary) {
        int count = 0;
        System.out.println("Сотрудники с зарплатой от " + salary + " рублей:");
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() >= salary) {
                    System.out.println("ID " + employee.getId() + ", " + employee.getName() + ", зарплата: " + employee.getSalary() + " руб.");
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("В компании нет сотрудников с зарплатой выше " + salary + " руб.");
        }
    }
}