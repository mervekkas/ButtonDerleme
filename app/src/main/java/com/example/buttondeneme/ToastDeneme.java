package com.example.buttondeneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ToastDeneme extends AppCompatActivity {

    private Button buttonNormal, buttonOzel, buttonDiger4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_deneme);

        buttonNormal = findViewById(R.id.buttonNormal);
        buttonOzel = findViewById(R.id.buttonOzel);
        buttonDiger4 = findViewById(R.id.buttonDiger4);

        buttonNormal.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                Toast.makeText(ToastDeneme.this,"Normal Toast Deneme", Toast.LENGTH_SHORT).show();
            }
        });
        buttonOzel.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                //tasarımı buraya bağlıyoruz
                View tasarim = getLayoutInflater().inflate(R.layout.toast_tasarim,null);

                //textviewi burada tanıtıyoruz
                TextView textViewToast = tasarim.findViewById(R.id.textViewToast);

                //özel toast mesaj oluşturuyoruz
                Toast toastOzel = new Toast(ToastDeneme.this);
                toastOzel.setView(tasarim);

                //mesajın konumunu ayarlıyoruz
                toastOzel.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL,0,0);
                toastOzel.setDuration(Toast.LENGTH_LONG);

                toastOzel.show();
            }
        });

        buttonDiger4.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ToastDeneme.this,PopupMenuDeneme.class);
                startActivity(intent);
            }
        });
    }

}
