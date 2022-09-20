package org.launchcode.restaurant;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;

    public MenuItem(String name, String category, double price, String description) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }



   }
