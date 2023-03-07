package kursovaya;

import java.util.Arrays;

public class Main {

    public static Employee[] employees = new Employee[10];

    static void getListEmployers() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            System.out.println(employees[i]);
        }
    }

    static double sumSalaryMonth() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    static double average() {
        int arrLength = employees.length;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                arrLength--;
            }
        }
        return (double) sumSalaryMonth() / arrLength;
    }

    static double minSalary() {

        double minSalary = sumSalaryMonth();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            } else if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    static double maxSalary() {
        double maxSalary = 0;
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

    static void getFIO() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            System.out.println(employees[i].getFamily() + " " + employees[i].getName() + " " + employees[i].getLastName());
        }
    }

    public static void main(String[] args) {

        //employees[0] = new Employee(1, "Ivanov", "Ivan", "Ivanovich", 110_000);
        employees[1] = new Employee(2, "Vasiliev", "Vasil", "Vasilievich", 80_000);
        employees[2] = new Employee(3, "Antonov", "Anton", "Antonovich", 65_000);
        employees[3] = new Employee(4, "Petrov", "Petr", "Petrovich", 65_000);
        employees[4] = new Employee(5, "Pavlov", "Pavel", "Pavlovich", 65_000);
        //employees[5] = new Employee(5, "Sergeev", "Sergei", "Sergeevich", 45_000);
        employees[6] = new Employee(5, "Michailov", "Michail", "Michailovich", 45_000);
        employees[7] = new Employee(5, "Andreev", "Andrey", "Andreevich", 40_000);
        employees[8] = new Employee(5, "Grigoriev", "Grigoriy", "Grigorievich", 55_000);
        //employees[9] = new Employee(5, "Bogov", "Bog", "Bogovich", 55_000);

        getListEmployers();
        System.out.println(sumSalaryMonth());
        System.out.println(minSalary());
        System.out.println(maxSalary());
        System.out.println(average());
        getFIO();


    }
}
