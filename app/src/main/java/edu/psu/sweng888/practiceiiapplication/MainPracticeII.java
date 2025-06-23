package edu.psu.sweng888.practiceiiapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainPracticeII extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_practiceii);
        ArrayList<Item> items = loadItemData();
        ItemListAdapter adapter = new ItemListAdapter (MainPracticeII.this, items);
        ListView mListViewItems = findViewById(R.id.listview_items);
        mListViewItems.setAdapter(adapter);
        mListViewItems.setOnItemClickListener((parent, view, position, id) -> {
            Item selectedItem = (Item) parent.getItemAtPosition(position);
            Intent intent = new Intent(MainPracticeII.this, Description.class);
            intent.putExtra("selectedItem", selectedItem);
            startActivity(intent);
        });
    }

    private ArrayList<Item> loadItemData() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1, "A", "a"));

        return items;
    }
}