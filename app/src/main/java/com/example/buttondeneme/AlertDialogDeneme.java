package com.example.buttondeneme;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AlertDialogDeneme extends AppCompatActivity {

    private Button buttonNormal, buttonOzel, buttonDiger6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_deneme);

        buttonNormal = findViewById(R.id.buttonNormal);
        buttonOzel = findViewById(R.id.buttonOzel);
        buttonDiger6 = findViewById(R.id.buttonDiger6);

        buttonNormal.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder ad = new AlertDialog.Builder(AlertDialogDeneme.this);

                ad.setMessage("Mesaj");
                ad.setTitle("Başlık");
                ad.setIcon(R.drawable.ic_audiotrack_black_24dp);

                ad.setPositiveButton("Tamam", new DialogInterface.OnClickListener( ) {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(AlertDialogDeneme.this,"Tamam Seçildi",Toast.LENGTH_SHORT).show();
                    }
                });
                ad.setNegativeButton("İptal", new DialogInterface.OnClickListener( ) {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(AlertDialogDeneme.this,"İptal Seçildi", Toast.LENGTH_SHORT).show();
                    }
                });
                ad.create().show();
            }
        });

        buttonOzel.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                View tasarim = getLayoutInflater().inflate(R.layout.alert_dialog_tasarim,null);
                final EditText editTextAlert = tasarim.findViewById(R.id.editTextAlert);

                AlertDialog.Builder ad = new AlertDialog.Builder(AlertDialogDeneme.this);
                ad.setTitle("Başlık");
                ad.setMessage("Mesaj");
                ad.setView(tasarim);

                ad.setPositiveButton("Tamam", new DialogInterface.OnClickListener( ) {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        String gelenVeri = editTextAlert.getText().toString();
                        Toast.makeText(AlertDialogDeneme.this,"Alınan veri:"+gelenVeri,Toast.LENGTH_SHORT).show();
                    }
                });
                ad.setNegativeButton("İptal", new DialogInterface.OnClickListener( ) {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        String gelenVeri = editTextAlert.getText().toString();
                        Toast.makeText(AlertDialogDeneme.this,"Alınan veri:"+gelenVeri,Toast.LENGTH_SHORT).show();
                    }
                });
                ad.create().show();
            }
        });

        buttonDiger6.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AlertDialogDeneme.this,SnackBarDeneme.class);
                startActivity(intent);
            }
        });
    }
}
