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

    public String searchMinSalaryEmployee() {
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

    public String searchMaxSalaryEmployee() {
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

    public double countAverageSalary() {
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

    public void showAllNamesOfEmployees() {
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

    public void indexSalary(int index) {
        for (Employee employee : employees) {
            if (employee != null) {
                double newSalary = employee.getSalary() + employee.getSalary() * index / 100;
                employee.setSalary(newSalary);
            }
        }
    }

    public String searchMinSalaryEmployeeInDepartment(int department) {

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

    public String searchMaxSalaryEmployeeInDepartment(int department) {
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

    public double countAllSalaryInDepartment(int department) {
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public double countAverageSalaryInDepartment(int department) {
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

    public void indexSalaryInDepartment(int department, int index) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double newSalary = employee.getSalary() + employee.getSalary() * index / 100;
                employee.setSalary(newSalary);
            }
        }
    }

    public void showAllEmployeesInDepartment(int department) {
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

    public void searchEmployeeMoreThan(double salary) {
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

    public boolean addEmployee(String name, int department, int salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить контакт, закончилось место");
            return false;
        }
        Employee newEmployee = new Employee(name, department, salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                size++;
                break;
            }
        }
        return true;
    }

    public void deleteEmployeeById(int id) {
        boolean isId = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getId() == id) {
                    System.out.println("Сотрудник: " + employees[i].getName() + " удален");
                    employees[i] = null;
                    size--;
                    isId = true;
                }
            }
        }
        if (!isId) {
            System.out.println("Сотрудника с ID " + id + " нет в компании");
        }
    }

    public void searchEmployeeById(int id) {
        boolean isId = false;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getId() == id) {
                    System.out.println(employee);
                    isId = true;
                }
            }
        }
        if (!isId) {
            System.out.println("Сотрудника с ID " + id + " нет в компании");
        }
    }
}
