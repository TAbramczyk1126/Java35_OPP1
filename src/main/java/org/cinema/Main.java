package org.cinema;

public class Main {

    public static void main(String[] args) {

        TicketSeller ticketSeller = new TicketSeller("Anna", "Nowak", 2019, 3000);
        System.out.println(ticketSeller.introduce());

        Manager manager = new Manager("Jan", "Kowalski", 2015, 5000, 650);
        System.out.println(manager.introduce());

        Manager manager1 = new Manager("Jan", "Kowalski", 2015, 5000, 500);
        System.out.println(manager1.introduce());
    }
}
