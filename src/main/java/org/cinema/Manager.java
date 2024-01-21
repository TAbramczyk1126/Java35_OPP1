package org.cinema;

public class Manager extends BaseEmployee {

    static final int baseSalary = 5000;
    static int bonus = 500;

    public Manager(String name, String surname, int yearOfEmployment, int baseSalary,int bonus) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
        this.bonus = bonus;
    }
}
