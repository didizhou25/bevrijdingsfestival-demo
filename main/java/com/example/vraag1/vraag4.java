package com.example.vraag1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vraag4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vraag4);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                openQuestion5();
            }
        } );

    }

    public void openQuestion5(){
        Intent intent = new Intent(this, vraag5.class);
        startActivity (intent);
    }
}
