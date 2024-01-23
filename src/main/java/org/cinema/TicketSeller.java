package org.cinema;

public class TicketSeller extends BaseEmployee {

    public TicketSeller(String name, String surname, int yearOfEmployment) {
        super(3000);
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
    }
}
