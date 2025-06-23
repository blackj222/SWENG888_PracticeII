package edu.psu.sweng888.practiceiiapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ItemListAdapter extends ArrayAdapter<Item> {
    public ItemListAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.dropdown_item, parent, false);
        }
        Item item = getItem(position);

        TextView textViewTitle = convertView.findViewById(R.id.textview_item_title);
        TextView textViewSubtitle = convertView.findViewById(R.id.textview_item_subtitle);

        assert item != null;
        textViewTitle.setText(item.getTitle());
        textViewSubtitle.setText(item.getSubtitle());

        return convertView;
    }
}