package com.example.hsmtn.ekrandegistir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    EditText e3;
    TextView t1;
    ArrayList<String> liste;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);
        e3=(EditText) findViewById(R.id.editText3);
        t1=(TextView) findViewById(R.id.textView2);
        liste=new ArrayList<>();

    }

    public void ikinciAc(View v){
        if(v.getId()==R.id.button){
            ikinciAktivity ik=new ikinciAktivity();
            Intent i=new Intent(getApplicationContext(),ikinciAktivity.class);
            String s="";
            for( String ss  : liste){
                s+=ss+"\n";
            }

            i.putExtra("yazilar",s);
            startActivity(i);
        }

        if (v.getId()==R.id.button2){

            String s1=e1.getText().toString();
            String s2=e2.getText().toString();
            String s3=e3.getText().toString();
            String s=s1+" "+s2+" "+s3;
            liste.add(s);

        }
    }
}
