package com.android.kumaratul.hope;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Viewrecord extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner sp;
    String ar[]={"CANCER PATIENT","EDUCATION","MEDICAL PROBLEM","OLD AGE HOMES","DEFICIENCY OF ORGAN/BLOOD","FLOOD RELIEFS","OTHERS"};
    Button b1,b2,b3,b4,b5;TextView t1,t2;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewrecord);
        b1=(Button)findViewById(R.id.button18);
        b2=(Button)findViewById(R.id.button19);
        b3=(Button)findViewById(R.id.button20);
        b4=(Button)findViewById(R.id.button12);
        b5=(Button)findViewById(R.id.button13);
        db=openOrCreateDatabase("priyanka",MODE_PRIVATE,null);
        t1=(TextView)findViewById(R.id.textView5);
        sp=(Spinner)findViewById(R.id.spinner2);
        sp.setOnItemSelectedListener(this);
        final ArrayAdapter aa =
                new ArrayAdapter(this,android.R.layout.simple_spinner_item,ar);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(aa);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor c=db.rawQuery("select *from student",null);
                String data="PROFILE";
                while (c.moveToNext())
                {
                    data=data+"\n"+c.getString(0)+"\n"+c.getString(1)+"\n"+c.getString(3)+"\n"+c.getString(4)+"\n";
                }
                t1.setText(data);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Viewrecord.this,Updateuser.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Viewrecord.this,Deleteuser.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Viewrecord.this,Wanthelp.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Viewrecord.this,Wanttohelp.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(getApplicationContext(),ar[position],Toast.LENGTH_LONG).show();
        t2=(TextView)findViewById(R.id.textView10);
        t2.setText(ar[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
