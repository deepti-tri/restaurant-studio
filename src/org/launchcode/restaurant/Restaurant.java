package org.launchcode.restaurant;

public class Restaurant {
    public static void main(String[] args) {
        Menu.initializeMenu();
        Menu.printMenu();
        System.out.println();
        System.out.println("This menu was last updated at " + Menu.getDate());

    }
}
