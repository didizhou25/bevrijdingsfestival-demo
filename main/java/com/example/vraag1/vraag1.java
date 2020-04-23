package com.example.vraag1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class vraag1 extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.bevrijdingsfestival_festivalapp.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.example.bevrijdingsfestival_festivalapp.EXTRA_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vraag1);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                openQuestion2();
            }
        } );

    }

    public void openQuestion2(){
        Intent intent = new Intent(this, vraag2.class);
        startActivity (intent);
    }
}
