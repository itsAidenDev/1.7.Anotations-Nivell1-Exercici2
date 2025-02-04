package org.example.main;

import org.example.classes.OnSiteWorker;
import org.example.classes.OnlineWorker;
import org.example.classes.Worker;

@SuppressWarnings("deprecation")

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Vanina", "Vega", 1400);
        System.out.println("Salary: " + worker1.calculateSalary(140));

        OnlineWorker onlineWorker1 = new OnlineWorker("Mark", "Smith", 1800);
        System.out.println("Salary: " + onlineWorker1.calculateSalary(200));

        OnSiteWorker onSiteWorker1 = new OnSiteWorker("David", "García", 2000);
        System.out.println("Salary: " + worker1.calculateSalary(210));
    }
}