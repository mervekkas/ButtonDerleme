package com.example.buttondeneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class ButtonDeneme2 extends AppCompatActivity {


    private CheckBox checkBoxJava, checkBoxPython;
    private RadioButton radioButtonGs, radioButtonFb, radioButtonBk;
    private Button buttonSonuc;
    private TextView textViewSonuc;
    private Button buttonDiger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_deneme2);


        checkBoxJava = findViewById(R.id.checkBoxJava);
        checkBoxPython = findViewById(R.id.checkBoxPython);
        radioButtonBk = findViewById(R.id.radioButtonBk);
        radioButtonFb = findViewById(R.id.radioButtonFb);
        radioButtonGs = findViewById(R.id.radioButtonGs);
        buttonSonuc = findViewById(R.id.buttonSonuc);
        textViewSonuc = findViewById(R.id.textViewSonuc);
        buttonDiger = findViewById(R.id.buttonDiger3);

        buttonSonuc.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                Boolean JavaDurum = checkBoxJava.isChecked();
                Boolean PythonDurum = checkBoxPython.isChecked();
                Boolean BkDurum = radioButtonBk.isChecked();
                Boolean FbDurum = radioButtonFb.isChecked();
                Boolean GsDurum = radioButtonGs.isChecked();

                textViewSonuc.setText(String.valueOf(JavaDurum));
            }
        });

        buttonDiger.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(ButtonDeneme2.this, BarDeneme.class);
                startActivity(intent);
            }
        });

    }
}
