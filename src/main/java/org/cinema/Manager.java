package org.cinema;

public class Manager extends BaseEmployee {

    public Manager(String name, String surname, int yearOfEmployment, int baseSalary, int bonus) {
        if (baseSalary == 5000) {
            this.name = name;
            this.surname = surname;
            this.yearOfEmployment = yearOfEmployment;
            this.baseSalary = baseSalary;
            this.bonus = bonus;
        } else {
            System.out.println("Wrong base salary, please enter correct base salary and try again.");
        }
    }
}
