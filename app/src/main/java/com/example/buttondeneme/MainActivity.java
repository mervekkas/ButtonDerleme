package com.example.buttondeneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Switch switch1;
    private ToggleButton toggleButton;
    private TextView textView;
    private TextView textView2;
    private Button buttonDiger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = findViewById(R.id.switch1);
        toggleButton = findViewById(R.id.toggleButton);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        buttonDiger = findViewById(R.id.buttonDiger3);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener( ) {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    textView.setText("Açık");

                   Toast.makeText(getApplicationContext(),"Switch Açık",Toast.LENGTH_LONG).show();
                }
                else {

                    textView.setText("Kapalı");

                    Toast.makeText(getApplicationContext(),"Switch Kapalı",Toast.LENGTH_LONG).show();
                }
            }
        });

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener( ) {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){

                    textView2.setText("Açık");

                    Toast.makeText(getApplicationContext(),"Toggle Butonu Açık",Toast.LENGTH_LONG).show();
                }
                else {

                    textView2.setText("Kapalı");

                    Toast.makeText(getApplicationContext(),"Toggle Butonu Kapalı",Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonDiger.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (MainActivity.this, ButtonDeneme2.class);
                startActivity(intent);
            }
        });

    }
}
