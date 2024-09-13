package org.launchcode;

import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price;
    private Date addDate;

    public MenuItem(String name, String description, String category, double price, Date date){
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.addDate = date;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public Date getAddDate() {
        return addDate;
    }
}
