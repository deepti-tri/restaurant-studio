package org.launchcode.restaurant;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, String category, double price, String description, boolean isNew) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.isNew = isNew;
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

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }
}
