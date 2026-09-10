package com.foodordr;
import java.util.Scanner;

class Food {
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayFoodDetails() {
        System.out.println("Food Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Pizza extends Food {
    private String size;

    public void setSize(String size) {
        this.size = size;
    }

    public void displayPizzaDetails() {
        System.out.println("Pizza Size: " + size);
    }
}

class Burger extends Food {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public void displayBurgerDetails() {
        System.out.println("Burger Type: " + type);
    }
}

public class FoodDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pizza
        Pizza p = new Pizza();

        System.out.println("--- Enter Pizza Details ---");

        System.out.print("Enter pizza name: ");
        p.setName(sc.nextLine());

        System.out.print("Enter pizza price: ");
        p.setPrice(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter pizza size: ");
        p.setSize(sc.nextLine());

        // Burger
        Burger b = new Burger();

        System.out.println("\n--- Enter Burger Details ---");

        System.out.print("Enter burger name: ");
        b.setName(sc.nextLine());

        System.out.print("Enter burger price: ");
        b.setPrice(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter burger type: ");
        b.setType(sc.nextLine());

        // Display
        System.out.println("\n--- Pizza Details ---");
        p.displayFoodDetails();
        p.displayPizzaDetails();

        System.out.println("\n--- Burger Details ---");
        b.displayFoodDetails();
        b.displayBurgerDetails();

        sc.close();
    }
}
