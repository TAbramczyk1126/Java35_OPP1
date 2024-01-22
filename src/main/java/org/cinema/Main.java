package org.cinema;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager("Jan", "Kowalski", 2018, 5000, 500);
        System.out.println(manager.introduce());
        System.out.println(manager.salaryManager());

        Manager manager1 = new Manager("Tomasz", "Adams", 2015, 900, 500);
        System.out.println(manager1.introduce());
        System.out.println(manager1.salaryManager());

        TicketSeller ticketSeller = new TicketSeller("Anna", "Nowak", 2019,3000);
        System.out.println(ticketSeller.introduce());
        System.out.println(ticketSeller.salaryTicketSeller());
    }
}
