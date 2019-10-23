package com.wina.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtnama;
    EditText edtnpm;
    Button btnsave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnama =(EditText) findViewById(R.id.edtnama);
        edtnpm =(EditText) findViewById(R.id.edtnpm);
        btnsave =(Button) findViewById(R.id.btnsave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String npms = edtnpm.getText().toString();
                String namas = edtnama.getText().toString();

                Intent next = new Intent(MainActivity.this,Halaman2.class);
                next.putExtra("npms", npms);
                next.putExtra("namas", namas);
                startActivity(next);
                finish();
            }
        });
    }
}
