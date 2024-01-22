package org.cinema;

public class TicketSeller extends BaseEmployee {

    static final int baseSalary = 3000;
    static final int bonus = 0;

    int i = baseSalary;

    public TicketSeller(String name, String surname, int yearOfEmployment, int baseSalary) {
        if (baseSalary == i) {
            this.name = name;
            this.surname = surname;
            this.yearOfEmployment = yearOfEmployment;
        } else {
            System.out.println("Wrong base salary, please enter correct base salary and try again.");
        }
    }
}
