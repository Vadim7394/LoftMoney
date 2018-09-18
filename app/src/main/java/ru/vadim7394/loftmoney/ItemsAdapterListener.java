package ru.vadim7394.loftmoney;

/**
 * Created by admin on 19.09.2018.
 */

interface ItemsAdapterListener {
    void onItemClick(Item item, int position);
    void onItemLongClick(Item item, int position);
}
