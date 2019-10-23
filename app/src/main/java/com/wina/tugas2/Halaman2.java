package com.wina.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Halaman2 extends AppCompatActivity {

    TextView txtdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        txtdata = (TextView) findViewById(R.id.txtdata);
        Intent datas = getIntent();

        String npm = datas.getStringExtra("npms");
        String nama = datas.getStringExtra("namas");
        txtdata.setText(nama + "\n" + npm);

    }

    @Override
    public void onBackPressed () {
        Intent back = new Intent(Halaman2.this, MainActivity.class);
        startActivity(back);
        finish();

    }
}
