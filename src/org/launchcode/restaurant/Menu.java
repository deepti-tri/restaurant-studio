package org.launchcode.restaurant;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Menu() {
        menuItems.add(new MenuItem("Noodles", "main course", 12.99, "Pad Thai"));
        menuItems.add(new MenuItem("Icecream", "dessert", 5.00, "Cherry Sundae"));
        menuItems.add(new MenuItem("fries", "appetizer", 3.50, "sweet potato"));
    }
}
