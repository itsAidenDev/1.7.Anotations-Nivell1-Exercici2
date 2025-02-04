package org.example.classes;

public class Worker {
    protected String name;
    protected String surname;
    protected double priceHour;

    public Worker(String name, String surname, double priceHour) {
        this.name = name;
        this.surname = surname;
        this.priceHour = priceHour;
    }

    public double calculateSalary(int hoursWorked) {
        double salary = hoursWorked * priceHour;
        return salary;
    }
}
