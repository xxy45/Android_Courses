package com.example.xxxxxxxy.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Just_Java extends AppCompatActivity {

    TextView text_count;
    TextView text_information;
    String message;
    int quantity = 0;
    Boolean hasCream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_just__java);
        text_information = (TextView) this.findViewById(R.id.information);
    }

    public void display(int t) {
        text_count = (TextView) findViewById(R.id.Count);
        text_count.setText("" + t);
    }

    public void add(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    public void sub(View view) {
        if (quantity >= 1)
            quantity = quantity - 1;
        else
            quantity = 0;
        display(quantity);
    }

    public void order(View view) {
        CheckBox cream = (CheckBox) findViewById(R.id.check);
        hasCream = cream.isChecked();
        message = "Name:Leo\n" + "Add whipped cream? " + hasCream +
                "\nQuantaty:" + quantity + "\nTotal: $" + quantity * 5 +
                "\nThank you!";
        text_information.setText(message);
    }

}
