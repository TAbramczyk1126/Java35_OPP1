package org.cinema;

public class BaseEmployee {

    String name;
    String surname;
    int yearOfEmployment;

    int calculateManagerMonthlySalary() {
        return Manager.baseSalary + Manager.bonus;
    }

    int calculateTicketSellerMonthlySalary() {
        return TicketSeller.baseSalary + TicketSeller.bonus;
    }

    int getSeniority() {
        return 2024 - yearOfEmployment;
    }

    String introduce(){
        return "My name is " + name + " " + surname + ". I have been working here for " + getSeniority() + " years.";
    }
    String salaryManager(){
        return "My salary is " + calculateManagerMonthlySalary() + " PLN.";
    }
    String salaryTicketSeller(){
        return "My salary is " + calculateTicketSellerMonthlySalary() + " PLN.";
    }
}
