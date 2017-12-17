package com.sheygam.java_17_17_12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    private EditText inputName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.my_btn);
        inputName  = findViewById(R.id.input_name);
        btn.setOnClickListener(this);
    }

    public void myClick(View view){
        Toast.makeText(this,"Was clicked btn",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.my_btn){
            String str = String.valueOf(inputName.getText());
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show();


        }
    }
}
