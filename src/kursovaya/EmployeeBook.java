package kursovaya;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class EmployeeBook {
    private Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(Employee NewEmployee) {

        if (size >= employees.length) {
            System.out.println("Книга заполнена");

        }
        if (size < employees.length) {
            Employee newEmp = NewEmployee;
            employees[size++] = newEmp;
            System.out.println("Добавлен сотрудник " + newEmp.getFamily());
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;

                if (i != employees.length - 1) {
                    Arrays.stream(employees).skip(i);//.forEach(System.out::println);
                    //System.arraycopy(employees,i + 1,employees,i,size-i);
                }
                size--;
                System.out.println("Сотрудник табельный номер " + id + " удален");
                return;
            }
        }
        System.out.println("Сотрудник под id " + id + " не найден");
    }

    public void changeEmployee(String family, double salary, int department) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && Objects.equals(employees[i].getFamily(), family)) {
                employees[i].setSalary(salary);
                employees[i].setDepartment(department);
            }
        }
    }
    public  void getListDep() {
        //Arrays.sort(employees, 0, employees.length, Comparator.comparing(Employee::getDepartment));
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }

            System.out.println(employees[i].getDepartment() + " " +employees[i].getFamily());
        }

    }

    public void getListEmployers() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            System.out.println(employees[i]);
        }
    }

    public double sumSalaryMonth() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public double getSumDep(int department) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (department == employees[i].getDepartment()) {
                double salary = employees[i].getSalary();
                sum += salary;
            }
        }
        System.out.println("Зарплата " + department + " отдел = " + sum + " рублей");
        return sum;
    }

    public double average() {
        int arrLength = employees.length;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                arrLength--;
            }
        }
        return sumSalaryMonth() / arrLength;
    }

    public double minSalary() {
        double minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            } else if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public double maxSalary() {
        double maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public void getFIO() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            System.out.println(employees[i].getFamily() + " " + employees[i].getName() + " " + employees[i].getLastName());
        }
    }

    public double increaseSalary(double persent) {
        double salary = 0;
        persent = (100 + persent) / 100;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            salary = employees[i].getSalary() * persent;
            employees[i].setSalary(salary);
        }
        return salary;
    }

    public double minSalaryDep(int department) {
        double minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i] != null && employees[i].getSalary() < minSalary && department == employees[i].getDepartment()) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная ЗП в отделе " + department + " - " + minSalary + " рублей");
        return minSalary;
    }

    public double maxSalaryDept(int department) {
        double maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getSalary() > maxSalary && department == employees[i].getDepartment()) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная ЗП в отделе " + department + " - " + maxSalary + " рублей");
        return maxSalary;
    }

    public double increaseSalaryDept(double persent, int department) {
        double salary = 0;
        persent = (100 + persent) / 100;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (department == employees[i].getDepartment()) {
                salary = employees[i].getSalary() * persent;
                employees[i].setSalary(salary);
            }
        }
        System.out.println("ЗП в отделе " + department + " увеличена на " + (int) ((persent * 100) - 100) + " %");
        return salary;
    }

    public void printDepartment(int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (department == employees[i].getDepartment()) {
                System.out.println(
                        "Табельный номер - " + employees[i].getId() + ", Фамилия "
                                + employees[i].getFamily() + ", Имя "
                                + employees[i].getName() + ", Отчество "
                                + employees[i].getLastName() + ", ЗП "
                                + (int) employees[i].getSalary());
            }
        }
    }

    public void searchEmployerSalary(int searchSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getSalary() >= searchSalary) {
                System.out.println((int) employees[i].getSalary());
            }
        }
    }
}




