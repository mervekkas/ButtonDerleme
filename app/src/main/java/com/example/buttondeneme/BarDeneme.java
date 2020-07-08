package com.example.buttondeneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class BarDeneme extends AppCompatActivity {


    private ProgressBar progressBar;
    private SeekBar seekBar;
    private RatingBar ratingBar;
    private TextView textViewSeek;
    private Button buttonBasla, buttonBitir, buttonSonuc, buttonDiger3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_deneme);

        buttonBasla = findViewById(R.id.buttonBasla);
        buttonBitir = findViewById(R.id.buttonBitir);
        buttonSonuc = findViewById(R.id.buttonSonuc);
        buttonDiger3 = findViewById(R.id.buttonDiger3);
        progressBar = findViewById(R.id.progressBar);
        seekBar = findViewById(R.id.seekBar);
        ratingBar = findViewById(R.id.ratingBar);
        textViewSeek = findViewById(R.id.textViewSeek);

        buttonBasla.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                progressBar.setVisibility(View.VISIBLE);
            }
        });
        buttonBitir.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                progressBar.setVisibility(View.INVISIBLE);
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener( ) {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textViewSeek.setText("Sonuç:"+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        buttonSonuc.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                float gelenOylama = ratingBar.getRating();

               Log.e("Oylama Sonucu:", String.valueOf(gelenOylama));
            }
        });

        buttonDiger3.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BarDeneme.this, ToastDeneme.class);
                startActivity(intent);
            }
        });
    }
}
