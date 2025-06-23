package edu.psu.sweng888.practiceiiapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Description extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        // Get the selected Item object from the Intent extras
        Item selectedItem = (Item) getIntent().getSerializableExtra("selectedItem");

        // Find the TextViews in the layout
        TextView mTextViewTitle = findViewById(R.id.description_title);
        TextView mTextViewSubtitle = findViewById(R.id.description_subtitle);

        // Set the TextViews with the Item attributes
        assert selectedItem != null;
        mTextViewTitle.setText(selectedItem.getTitle());
        mTextViewSubtitle.setText(selectedItem.getSubtitle());
    }
}