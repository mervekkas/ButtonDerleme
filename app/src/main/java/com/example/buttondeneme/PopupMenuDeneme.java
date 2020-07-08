package com.example.buttondeneme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PopupMenuDeneme extends AppCompatActivity {

    private Button buttonMenu, buttonDiger5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu_deneme);

        buttonMenu = findViewById(R.id.buttonMenu);
        buttonDiger5 = findViewById(R.id.buttonDiger5);

        buttonMenu.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                PopupMenu popup = new PopupMenu(PopupMenuDeneme.this,buttonMenu);

                popup.getMenuInflater().inflate(R.menu.popupmenu,popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener( ) {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch (item.getItemId()){
                            case R.id.actionSil:

                                Toast.makeText(PopupMenuDeneme.this,"Sile tıklandı",Toast.LENGTH_SHORT).show();
                                return true;

                                default: return false;
                        }
                    }
                });

                popup.show();
            }
        });

        buttonDiger5.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PopupMenuDeneme.this,AlertDialogDeneme.class);
                startActivity(intent);
            }
        });

    }

}
