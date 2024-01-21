package org.cinema;

public class TicketSeller extends BaseEmployee {

    static final int baseSalary = 3000;
    static final int bonus = 0;

    public TicketSeller(String name, String surname, int yearOfEmployment, int baseSalary) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
    }
}
