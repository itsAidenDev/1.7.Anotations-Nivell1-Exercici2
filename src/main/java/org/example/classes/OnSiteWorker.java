package org.example.classes;

public class OnSiteWorker extends Worker {
    private static double gasoline = 26;

    public OnSiteWorker(String name, String surname, double priceHour) {
        super (name, surname, priceHour);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) * gasoline;
    }
}

