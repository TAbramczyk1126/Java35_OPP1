package org.cinema;

public class TicketSeller extends BaseEmployee {


    public TicketSeller(String name, String surname, int yearOfEmployment, int baseSalary) {
        if (baseSalary == 3000) {
            this.name = name;
            this.surname = surname;
            this.yearOfEmployment = yearOfEmployment;
        } else {
            System.out.println("Wrong base salary, please enter correct base salary and try again.");
        }
    }
}
