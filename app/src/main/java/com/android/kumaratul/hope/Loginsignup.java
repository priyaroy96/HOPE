package com.android.kumaratul.hope;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Loginsignup extends AppCompatActivity {
    SQLiteDatabase db; EditText e1,e2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginsignup);
        db=openOrCreateDatabase("priyanka",MODE_PRIVATE,null);
        db.execSQL("create table IF NOT EXISTS student(name varchar(25),email varchar(40),pass varchar(20),mobile varchar(15),address varchar(100))");
        e1=(EditText)findViewById(R.id.editText7);
        e2=(EditText)findViewById(R.id.editText8);
        b1=(Button)findViewById(R.id.button4);
        b2=(Button)findViewById(R.id.button5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e = e1.getText().toString();
                String p= e2.getText().toString();
                Cursor c=db.rawQuery("Select email,pass from student where email='"+e+"' and pass='"+p+"'",null);
                if (c.moveToNext())
                {
                    Intent i=new Intent(Loginsignup.this,Viewrecord.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Login fail please enter the correct password",Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Loginsignup.this,Usersignup.class);
                startActivity(i2);
            }
        });

    }
}
