package com.example.nirmawati.praktikum2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Nirmawati on 9/22/2017.
 */

public class ContohActivity extends Activity {
    @Override
    protected  void  onCreate (@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.layout_contoh);
        Button tmbl = (Button) findViewById(R.id.button1);
        tmbl.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(ContohActivity.this, ActivityUtama.class);
                startActivity(in);
            }
        }));
    }
}
