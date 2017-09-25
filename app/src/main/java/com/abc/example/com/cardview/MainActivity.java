package com.abc.example.com.cardview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

public class MainActivity extends AppCompatActivity {
    private Context mContext;

    private CardView mCardViewTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Change the action bar color
        // Get the widgets reference from XML layout
        mCardViewTop = (CardView) findViewById(R.id.card_view_top);

        /*
            public void setRadius (float radius)
                Updates the corner radius of the CardView.

            Related XML Attributes
                android.support.v7.cardview:cardCornerRadius

            Parameters
                radius : The radius in pixels of the corners of the rectangle shape
        */

        // Set the CardView corner radius programmatically
    }
}
