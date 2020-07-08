package com.example.buttondeneme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class SnackBarDeneme extends AppCompatActivity {

    private Button buttonNormal, buttonGeri, buttonOzel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar_deneme);

        buttonNormal = findViewById(R.id.buttonNormal);
        buttonOzel = findViewById(R.id.buttonOzel);
        buttonGeri = findViewById(R.id.buttonGeri);

        buttonNormal.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

              Snackbar.make(buttonNormal, "Merhaba", Snackbar.LENGTH_SHORT).show();
            }
        });
        buttonGeri.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                Snackbar.make(v,"Mesaj Silinsin mi?", Snackbar.LENGTH_LONG)
                        .setAction("Evet", new View.OnClickListener( ) {
                            @Override
                            public void onClick(View v) {

                                Snackbar.make(v, "mesaj silindi", Snackbar.LENGTH_SHORT).show();
                            }
                        }).show();
            }
        });
        buttonOzel.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                Snackbar snackbar = Snackbar.make(v, "İnternet Bağlantısı Yok", Snackbar.LENGTH_SHORT)
                        .setAction("Tekrar Dene", new View.OnClickListener( ) {
                            @Override
                            public void onClick(View v) {
                                Snackbar.make(v, "Bağlanmayı deniyor", Snackbar.LENGTH_SHORT).show();
                            }
                        });
                snackbar.setActionTextColor(Color.YELLOW);
                snackbar.getView().setBackgroundColor(Color.WHITE);

                View sview = snackbar.getView();

                TextView textView = sview.findViewById(com.google.android.material.R.id.snackbar_text);
                textView.setTextColor(Color.RED);
                snackbar.show();
            }
        });
    }
}
