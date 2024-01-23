package org.cinema;

public class Manager extends BaseEmployee {

    public Manager(String name, String surname, int yearOfEmployment) {
        super(5000);
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
        this.bonus = 500;
    }
    public void setBonus(int bonus) {
        if (bonus < 0) {
            System.out.println("Bonus cannot be negative");
            return;
        }
        this.bonus = bonus;
    }
}
