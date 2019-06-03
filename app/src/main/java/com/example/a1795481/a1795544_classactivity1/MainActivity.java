package com.example.a1795481.a1795544_classactivity1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edt_name,edt_email,edt_pass;
        Button btn_sub;
        static String TAG = "my info";
        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_classwork);

            edt_name = findViewById(R.id.edt_name);
            edt_email = findViewById(R.id.edt_email);
            edt_pass = findViewById(R.id.edt_numpass);

            btn_sub = findViewById(R.id.btn_submit);

            btn_sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String name = edt_name.getText().toString();
                    String email = edt_email.getText().toString();

                    Log.v(TAG, name);
                    Log.v(TAG, email);
                    Log.v(TAG, edt_pass.getText().toString());

                }
            });


        }