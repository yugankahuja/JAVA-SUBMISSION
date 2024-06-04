package com.ey.problem1;


public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Manager 1");
        Manager manager2 = new Manager("Manager 2");

        manager1.start();
        manager2.start();
        
        try {
            manager1.join();
            manager2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
