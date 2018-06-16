package com.android.kumaratul.hope;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Benefits extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benefits);
        t1=(TextView)findViewById(R.id.textView6);
        String data="WHY HOPE:-"+"\n"+"1.It is online donation and receiver platform."+"\n"
                +"2.It fulfills the requirement of people who is cancer patient requires organ or blood."+"\n"
                +"3.It fulfills the requirement of people,who requires money for education,medical reliefs."+"\n"
                +"4.Donors feels happy and let the others to happy"+"\n"+"\n"
                +"WORKING WITH HOPE:-"+"\n"
                +"1.Different Self help groups,Social workers,Volunteers,NGO's can register themselves to help receivers."+"\n"
                +"2.This app allows the donors to go through various donation programs and help schemes where they Can contribute the Requirements of Receivers."+"\n"
                +"3.This App allows the receivers to fulfill their Requirements and utilities."+"\n"
                +"4.Donors are not those who have enough,But they are those who knows to give something out of something."+"\n"
                +"5.Receivers always thanks donors to contribute their essential credentials."+"\n"
                +"6.Any Illegal and Immoral things related to this app will be treated as dispute and Legal actions would be happen.";
        t1.setText(data);
    }
}
