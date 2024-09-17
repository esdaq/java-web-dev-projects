package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addToMenu(MenuItem item) {
        if(items.contains(item)){
            System.out.println("This is an duplicate item!");
        } else {
            items.add(item);
        }
    }

    public void removeFromMenu(MenuItem item) {
        items.remove(item);
    }

    public void displayMenu() {
        for(MenuItem item : items){
            System.out.println("\n" +item.getName());
        }
    }

    public void displayMenuItem(MenuItem item) {
        System.out.println(item.getName());
    }


}


