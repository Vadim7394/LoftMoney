package ru.vadim7394.loftmoney;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ItemsFragment extends Fragment {

    private static final String KEY_TYPE = "type";

    private static final int TYPE_UNKNOWN = -1;

    public static final int TYPE_EXPENSES = 1;
    public static final int TYPE_INCOMES = 2;

    private RecyclerView recycler;
    private ItemsAdapter adapter;

    private int type;

    public ItemsFragment() {}

    public static ItemsFragment newInstance(int type) {
        ItemsFragment fragment = new ItemsFragment();

        Bundle bundle = new Bundle();
        bundle.putInt(ItemsFragment.KEY_TYPE, type);

        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle args = getArguments();

        if(args != null) {
            type = args.getInt(KEY_TYPE, TYPE_UNKNOWN);

            if(type == TYPE_UNKNOWN) {
                throw new IllegalStateException("UNKNOWN TYPE");
            }
        } else {
            throw new IllegalStateException("YOU MAST PASS VALID FRAGMENT TYPE");
        }

        adapter  = new ItemsAdapter();
        adapter.setItems(createListItems());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_items, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recycler = view.findViewById(R.id.recycler);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    private List<Item> createListItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Молоко", "70р"));
        items.add(new Item("Зубная щетка", "70р"));
        items.add(new Item("Сковородка с антипригарным покрытием", "10000р"));
        items.add(new Item("Молоко", "70р"));
        items.add(new Item("Зубная щетка", "70р"));
        items.add(new Item("Сковородка с антипригарным покрытием", "10000р"));
        return items;
    }

}
