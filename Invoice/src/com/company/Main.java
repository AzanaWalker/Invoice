package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
        ArrayList<String> purchases = new ArrayList<String>();
        ArrayList<Double> transactiontotal = new ArrayList<Double>();
        products.add("Bison Sweater");
        prices.add(55.99);
        products.add("Bison Tee");
        prices.add(14.99);
        products.add("Bison Hoodie");
        prices.add(23.99);
        products.add("Bison Bumper sticker");
        prices.add(4.99);

        Scanner keyboard = new Scanner(System.in);
        String purchaseditem;
        double sum = 0.0;
        int index = -1;
        do {
            System.out.println("What item did you buy? If you did not buy anything or are done purchasing type complete: ");
            purchaseditem = keyboard.nextLine();
            purchases.add(purchaseditem);
            for (int i = 0; i < products.size(); i++) {
                if (purchaseditem.equals(products.get(i))) {
                    index = i;
                }
            }
            transactiontotal.add(prices.get(index));
        } while (!purchaseditem.equalsIgnoreCase("complete"));


        for (int i = 0; i < purchases.size() - 1; i++) {
            System.out.println("Items purchased: " + purchases.get(i));
            sum += transactiontotal.get(i);
        }

        System.out.println("Total Spent: " + sum);

    }

}