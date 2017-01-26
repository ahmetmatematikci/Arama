package com.ahmetmatematikci.arama;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       String number = "03223243065";

        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel: " + number));
        startActivity(i);
    }
}
