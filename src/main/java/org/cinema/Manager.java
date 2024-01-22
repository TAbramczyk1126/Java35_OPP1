package org.cinema;

public class Manager extends BaseEmployee {

    static final int baseSalary = 5000;
    static int bonus = 500;

    int i = baseSalary;

    public Manager(String name, String surname, int yearOfEmployment, int baseSalary, int bonus) {
        if (baseSalary == i) {
            this.name = name;
            this.surname = surname;
            this.yearOfEmployment = yearOfEmployment;
            this.bonus = bonus;
        } else {
            System.out.println("Wrong base salary, please enter correct base salary and try again.");
        }
    }
}
