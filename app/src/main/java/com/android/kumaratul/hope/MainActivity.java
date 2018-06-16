package com.android.kumaratul.hope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.red:
                Intent i4=new Intent(MainActivity.this,About.class);
                startActivity(i4);
                break;
            case R.id.green:
                Intent i5=new Intent(MainActivity.this,Loginsignup.class);

                startActivity(i5);
                break;
            case R.id.black:
                Intent i6=new Intent(MainActivity.this,Benefits.class);
                startActivity(i6);
                break;
            case R.id.brown:
                Intent i7=new Intent(MainActivity.this,Motto.class);
                startActivity(i7);
                break;

            default:
        }

        return super.onOptionsItemSelected(item);
    }

}
