public class EmployeeBook {
    private Employee[] employees = new Employee[10];
    private int size;

    public void showAllEmployees() {
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

    public double countAllSalary() {
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public Employee searchMinSalaryEmployee() {
        if (size == 0) {
            return null;
        }
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public Employee searchMaxSalaryEmployee() {
        if (size == 0) {
            return null;
        }
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public double countAverageSalary() {
        return size > 0 ? countAllSalary() / size : 0;
    }

    public void showAllNamesOfEmployees() {
        System.out.println("ФИО сотрудников компании:");
        if (size == 0) {
            System.out.println("В компании нет сотрудников");
            return;
        }
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    public void indexSalary(int index) {
        for (Employee employee : employees) {
            if (employee != null) {
                double newSalary = employee.getSalary() + employee.getSalary() * index / 100;
                employee.setSalary(newSalary);
            }
        }
    }

    public Employee searchMinSalaryEmployeeInDepartment(int department) {
        Employee.checkDepartment(department);
        Employee min = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (min == null || employee.getSalary() < min.getSalary()) {
                    min = employee;
                }
            }
        }
        return min;
    }

    public Employee searchMaxSalaryEmployeeInDepartment(int department) {
        Employee.checkDepartment(department);
        Employee max = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (max == null || employee.getSalary() > max.getSalary()) {
                    max = employee;
                }
            }
        }
        return max;
    }

    public double countAllSalaryInDepartment(int department) {
        Employee.checkDepartment(department);
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public double countAverageSalaryInDepartment(int department) {
        Employee.checkDepartment(department);
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                count++;
            }
        }
        return count > 0 ? countAllSalaryInDepartment(department) / count : 0;
    }

    public void indexSalaryInDepartment(int department, int index) {
        Employee.checkDepartment(department);
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double newSalary = employee.getSalary() + employee.getSalary() * index / 100;
                employee.setSalary(newSalary);
            }
        }
    }

    public void showAllEmployeesInDepartment(int department) {
        Employee.checkDepartment(department);
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

    public void searchEmployeeLessThan(double salary) {
        int count = 0;
        System.out.println("Сотрудники с зарплатой меньше " + salary + " рублей:");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("ID " + employee.getId() + ", " + employee.getName() + ", зарплата: " + employee.getSalary() + " руб.");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("В компании нет сотрудников с зарплатой ниже " + salary + " руб.");
        }
    }

    public void searchEmployeeMoreThan(double salary) {
        int count = 0;
        System.out.println("Сотрудники с зарплатой от " + salary + " рублей:");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println("ID " + employee.getId() + ", " + employee.getName() + ", зарплата: " + employee.getSalary() + " руб.");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("В компании нет сотрудников с зарплатой выше " + salary + " руб.");
        }
    }

    public boolean addEmployee(String name, int department, double salary) {
        if (size >= employees.length) {
            return false;
        }
        Employee employee = new Employee(name, department, salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                size++;
                break;
            }
        }
        return true;
    }

    public boolean deleteEmployeeById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public Employee searchEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}