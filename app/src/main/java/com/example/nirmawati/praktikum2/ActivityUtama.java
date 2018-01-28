package com.example.nirmawati.praktikum2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Nirmawati on 9/22/2017.
 */

public class ActivityUtama extends Activity {
    @Override
    protected  void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_utama);
        Button tbl = (Button) findViewById(R.id.button1);
        tbl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent in = new Intent(ActivityUtama.this,ContohActivity.class);
                startActivity(in);
            }
        });
    }
}
