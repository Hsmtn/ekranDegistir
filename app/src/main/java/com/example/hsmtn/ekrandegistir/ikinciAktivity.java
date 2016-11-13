package com.example.hsmtn.ekrandegistir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class ikinciAktivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikinci_aktivity);

        TextView t=(TextView) findViewById(R.id.textView);
        Bundle gelenVeri=getIntent().getExtras();
        String y=gelenVeri.getString("yazilar");
        t.setText(y);

    }



}
