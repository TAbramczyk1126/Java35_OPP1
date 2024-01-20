package org.cinema;

public class CinemaHall {

    public static void main(String[] args) {

        Seats seats = new Seats(7, 8);
        seats.booked = true;
        System.out.println(seats.number);
        System.out.println(seats.row);
        System.out.println(seats.booked);

        Seats seats1 = new Seats(9, 3);
        seats1.booked = false;
        System.out.println(seats1.number);
        System.out.println(seats1.row);
        System.out.println(seats1.booked);
    }
}
