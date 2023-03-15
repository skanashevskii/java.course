package kursovaya;

import java.util.Objects;

public class Employee {
    private int id;
    private String family;
    private String name;

    private String lastName;
    private int department;
    private double salary;

    public static int countId;


    public Employee(int department, String family, String name, String lastName, double salary) {

        this.family = family;
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = countId;
        countId++;
    }

    public String toString() {
        return "Таб.номер: " + this.id + " Отдел: " + this.department + " Фамилия: "
                + this.family + " Имя: " + this.name + " Отчество: " + this.lastName
                + " Оклад: " + String.format("%.2f", this.salary) + " рублей";

    }

    public int getId() {
        return this.id;
    }

    public String getFamily() {
        return this.family;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return family.equals(employee.family) && name.equals(employee.name) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, name, lastName);
    }

}



