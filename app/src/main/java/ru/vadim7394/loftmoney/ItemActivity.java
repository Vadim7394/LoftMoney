package ru.vadim7394.loftmoney;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Молоко", "70р"));
        items.add(new Item("Зубная щетка", "70р"));
        items.add(new Item("Сковородка с антипригарным покрытием", "10000р"));

        ItemsAdapter adapter = new ItemsAdapter();
        adapter.setItems(items);

        DividerItemDecoration itemDecorator = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        itemDecorator.setDrawable(ContextCompat.getDrawable(this, R.drawable.divider));

        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setAdapter(adapter);
        recycler.addItemDecoration(itemDecorator);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }
}
