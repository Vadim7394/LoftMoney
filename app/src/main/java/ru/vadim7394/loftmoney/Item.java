package ru.vadim7394.loftmoney;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by admin on 12.09.2018.
 */

public class Item implements Parcelable {
    private int id;
    private String name;
    private int price;
    private String type;

    public Item(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Item(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    protected Item(Parcel in) {
        id = in.readInt();
        name = in.readString();
        price = in.readInt();
        type = in.readString();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(name);
        parcel.writeInt(price);
        parcel.writeString(type);
    }
}
