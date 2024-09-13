package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    public Menu(ArrayList<MenuItem> items) {
        lastUpdated = new Date();
        this.menuItems = items;

    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
