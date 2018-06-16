package com.android.kumaratul.hope;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class About extends AppCompatActivity {

    TextView t1,t2;RatingBar r;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        t1=(TextView)findViewById(R.id.textView7);
        t2=(TextView)findViewById(R.id.textView8);
        String data="HOPE" +"\n"+
                " Today we are living in THE GENERATION OF HOPE.we had provided a platofrom where helpers and receivers meet," +
                " I much congratulate to the donaters and receivers for joining our platfrorm..Kindly help others to enjoy yourself " +
                "and give some happiness to others ";
        t1.setText(data);
        r=(RatingBar)findViewById(R.id.ratingBar);
        b=(Button)findViewById(R.id.button24);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=String.valueOf(r.getRating());
                s="Your rating is:-"+s+"\n"+"THANK YOU SO MUCH";
                t2.setText(s);
                android.support.v4.app.NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplication()).setSmallIcon(R.drawable.pic1)
                        .setContentTitle("HOPE").setContentText("Thanks for Using HOPE...");
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                PendingIntent contentIntent=PendingIntent.getActivity(getApplicationContext(),0,i,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(contentIntent);
                NotificationManager manager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(0,builder.build());
            }
        });
    }
}
