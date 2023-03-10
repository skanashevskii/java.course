package kursovaya;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();


        employeeBook.addEmployee(new Employee(1, "Ivanov", "Ivan", "Ivanovich", 110_000));
        employeeBook.addEmployee(new Employee(2, "Vasiliev", "Vasil", "Vasilievich", 80_000));
        employeeBook.addEmployee(new Employee(3, "Antonov", "Anton", "Antonovich", 65_000));
        employeeBook.addEmployee(new Employee(4, "Petrov", "Petr", "Petrovich", 65_000));
        employeeBook.addEmployee(new Employee(5, "Pavlov", "Pavel", "Pavlovich", 65_000));
        employeeBook.addEmployee(new Employee(5, "Sergeev", "Sergei", "Sergeevich", 45_000));
        employeeBook.addEmployee(new Employee(5, "Michailov", "Michail", "Michailovich", 45_000));
        employeeBook.addEmployee(new Employee(5, "Andreev", "Andrey", "Andreevich", 40_000));
        employeeBook.addEmployee(new Employee(5, "Grigoriev", "Grigoriy", "Grigorievich", 55_000));
        employeeBook.addEmployee(new Employee(5, "Bogov", "Bog", "Bogovich", 55_000));


        employeeBook.getListEmployers();
        employeeBook.removeEmployee(6);
        employeeBook.removeEmployee(9);
        employeeBook.addEmployee(new Employee(1, "Nikiforovv", "Nikifor", "Nikiforovich", 25_000));
        employeeBook.addEmployee(new Employee(1, "Nikiforov", "Nikifor", "Nikiforovich", 25_000));
        employeeBook.addEmployee(new Employee(1, "Nikiforov", "Nikifor", "Nikiforovich", 25_000));
        employeeBook.getListEmployers();
        employeeBook.changeEmployee("Nikiforovv",500,5);
        employeeBook.getListEmployers();
        employeeBook.getListDep();
    }


}


