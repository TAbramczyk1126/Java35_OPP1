package org.cinema;

public class Main {

    public static void main(String[] args) {

        TicketSeller ticketSeller = new TicketSeller("Anna", "Nowak", 2019);
        System.out.println(ticketSeller.introduce());

        Manager manager = new Manager("Jan", "Kowalski", 2015);
        System.out.println(manager.introduce());

        Manager manager1 = new Manager("Jan", "Kowalski", 2015);
        manager1.setBonus(600);
        System.out.println(manager1.introduce());

    }
}
