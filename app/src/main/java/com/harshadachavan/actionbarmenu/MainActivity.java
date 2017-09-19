package com.harshadachavan.actionbarmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);//Menu Resource, Menu
        menu.add(0, 1, Menu.NONE, "Computer");
        menu.add(0, 2, Menu.NONE, "Gamepad");
        menu.add(0, 3, Menu.NONE, "Camera");
        menu.add(0, 4, Menu.NONE, "Video");
        menu.add(0, 5, Menu.NONE, "Email");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case 1:
                Toast.makeText(getApplicationContext(),"Computer Selected",Toast.LENGTH_LONG).show();

                return true;
            case 2:
                Toast.makeText(getApplicationContext(),"Gamepad Selected",Toast.LENGTH_LONG).show();

                return true;
            case 3:
                 Toast.makeText(getApplicationContext(),"Camera Selected",Toast.LENGTH_LONG).show();

                return true;
            case 4:
                 Toast.makeText(getApplicationContext(),"Video Selected",Toast.LENGTH_LONG).show();

                return true;
            case 5:
                 Toast.makeText(getApplicationContext(),"Email Selected",Toast.LENGTH_LONG).show();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
