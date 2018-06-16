package com.android.kumaratul.hope;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Wanthelp extends AppCompatActivity {
    EditText e,to,subject,message;
    Button b,b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wanthelp);
        e=(EditText)findViewById(R.id.editText14);
        to=(EditText)findViewById(R.id.editText15);
        subject=(EditText)findViewById(R.id.editText16);
        message=(EditText)findViewById(R.id.editText17);
        b=(Button)findViewById(R.id.button1);
        b1=(Button)findViewById(R.id.button2);
        b2=(Button)findViewById(R.id.button3);
        b3=(Button)findViewById(R.id.button6);
        b4=(Button)findViewById(R.id.button7);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e1=e.getText().toString();
                Intent I2=new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:9083770941"));
                I2.putExtra("sms_body",e1);
                startActivity(I2);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t=to.getText().toString();
                String s=subject.getText().toString();
                String m=message.getText().toString();

                Intent email=new Intent(Intent.ACTION_SENDTO);
                String uriText="mailto:"+t+
                        "?subject=" + Uri.encode(s) +
                        "&body=" + Uri.encode(m);
                Uri uri =Uri.parse(uriText);

                email.setData(uri);
                startActivity(Intent.createChooser(email,"Send Email"));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I1=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9083770941"));
                startActivity(I1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplication()).setSmallIcon(R.drawable.pic1)
                        .setContentTitle("HOPE").setContentText("WE ARE VERY GLAD TO HELP YOU,PLEASE VISIT AGAIN !!");
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                PendingIntent contentIntent=PendingIntent.getActivity(getApplicationContext(),0,i,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(contentIntent);
                NotificationManager manager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(0,builder.build());
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplication()).setSmallIcon(R.drawable.pic1)
                        .setContentTitle("HOPE").setContentText("SORRY FOR THE INCONVENIENCE..WE WILL NOTIFY YOU WITHIN 24 HRS");
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                PendingIntent contentIntent=PendingIntent.getActivity(getApplicationContext(),0,i,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(contentIntent);
                NotificationManager manager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(0,builder.build());
            }
        });
    }
}
