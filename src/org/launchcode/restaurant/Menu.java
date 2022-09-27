package org.launchcode.restaurant;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Menu {
    private static ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

    public static String getDate() {
        LocalDateTime rawDate = LocalDateTime.now();
        DateTimeFormatter dateUpdated = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String myDate = rawDate.format(dateUpdated);
        return myDate;
    }
    static void initializeMenu() {
        menuItems.add(new MenuItem("Noodles", "main course", 12.99, "Pad Thai", true));
        menuItems.add(new MenuItem("Icecream", "dessert", 5.99, "Cherry Sundae", false));
        menuItems.add(new MenuItem("Fries", "appetizer", 3.99, "Sweet Potato", false));

    }




    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    public static void printMenu() {

        System.out.println("***** MENU *****");
        System.out.println();
        for (MenuItem item : menuItems) {
            System.out.print(item.getName() + " - " + item.getDescription() + " - "
                    + item.getCategory() + " - " + "$" + item.getPrice());
            if (item.isNew()) {
                System.out.println(" - NEW!");
            }
            else {
                System.out.println("");
            }
        }
    }
}
