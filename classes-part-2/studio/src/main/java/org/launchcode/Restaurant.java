package org.launchcode;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Restaurant {
    public static void main(String[] args) {



        MenuItem pizza = new MenuItem("Cheese Pizza", 10,
                "Pizza with Cheese","Main Course",true);
        MenuItem breadSticks = new MenuItem("Bread sticks", 5,
                "Bread sticks", "Appetizer", true);

        MenuItem cookie = new MenuItem("Chocolate Cookie", 1,
                "Chocolate Cookie", "Dessert", true);

        MenuItem veganPizza = new MenuItem("Vegan Pizza", 15,
                "Pizza with no Meat","Main Course",true);

        MenuItem duplicateVeganPizza = new MenuItem("Vegan Pizza", 15,
                "Pizza with no Meat","Main Course",true);

        Menu menu = new Menu(new Date(),
                new ArrayList<MenuItem>(Arrays.asList(pizza, breadSticks, cookie)));


        //menu.displayMenuItem(pizza);

        menu.addToMenu(veganPizza);

        //menu.removeFromMenu(pizza);
        menu.addToMenu(duplicateVeganPizza);
        menu.displayMenu();
    }
}
