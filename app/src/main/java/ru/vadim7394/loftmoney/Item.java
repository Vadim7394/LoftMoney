package ru.vadim7394.loftmoney;

/**
 * Created by admin on 12.09.2018.
 */

public class Item {
    private String name;
    private String price;

    Item(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
