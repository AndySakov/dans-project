package com.oloyede.daniel;

public enum Toppings {
    WHIPPED_CREAM("Whipped Cream"),
    CHOCOLATE("Chocolate"),
    LEMON_JUICE("Lemon Juice");

    private String name;

    Toppings(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


}

