package com.oloyede.daniel;

import java.util.Scanner;

public class GroupF_FruitSalad {

    Scanner scan = new Scanner(System.in);
    boolean nextOrder = true;
    String orderDetails = "";
    double raspberry, apricot, ugli, sum;
    int topping1;

    public void toppings() {
        System.out.print("Would you like to include a topping[Y/N]: ");
        String topping = scan.next();

        if(topping.equalsIgnoreCase("Y")) {
            System.out.print("Choose your topping\nOptions: \n1) Chocolate \n2) Whipped Cream \n3)Lemon Juice \nChoose a number please: ");
            topping1 = scan.nextInt();
            if(topping1 == 1) {
                orderDetails += " Chocolate ";
            } else if(topping1 == 2) {
                orderDetails += " Whipped Cream ";
            } else if(topping1 == 3) {
                orderDetails += " Lemon Juice ";
            } else {
                System.out.println("There is no topping matching your input!");
            }
        } else if (topping.equalsIgnoreCase("N")) {

        } else {
            System.out.println("Unsupported input!!!");
        }
    }

    public void order() {
        System.out.print("Welcome to Group F's Fruit salad maker!\nPlease enter how many grams of Raspberry you want in your salad: ");
        raspberry = scan.nextDouble();
        System.out.print("How much Apricot would you like in your salad(in grams): ");
        apricot = scan.nextDouble();
        System.out.print("How much Ugli would you like?(in grams): ");
        ugli = scan.nextDouble();

        sum = raspberry + apricot + ugli;


        if(!(raspberry == 0)) {
            orderDetails += " Raspberry ";
        }

        if(!(apricot == 0)) {
            orderDetails += " Apricot ";
        }

        if(!(ugli == 0)) {
            orderDetails += " Ugli ";
        }

        toppings();

        System.out.printf("Thank you for your order! Yor fruit salad is ready. Total weight of your salad is %.2fg \n",sum);
        System.out.printf("Ingredient(s) used are: %s \n", orderDetails);
        orderDetails = "";


        System.out.print("Would you like to place another order[Y/N]: ");
        String reply = scan.next();

        if(reply.equalsIgnoreCase("Y")) {
            nextOrder = true;
        } else if (reply.equalsIgnoreCase("N")) {
            nextOrder = false;
        } else {
            System.out.println("Unsupported input!!!");
            System.out.println("Closing application...");
            nextOrder = false;
        }
    }

    public static void main(String[] args) {
        int count = 0;
        GroupF_FruitSalad salad = new GroupF_FruitSalad();
        while (salad.nextOrder) {
            salad.order();
            count++;
        }

        System.out.printf("You placed %s orders. Thank you!", count);
    }
}
