package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a = findViewById(R.id.button);
        //انادي الedit text
        final EditText n = findViewById(R.id.editTextTextPersonName);
        final EditText k = findViewById(R.id.editTextTextPersonName2);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //اضيف ال getText.toString
                String ra = n.getText().toString();
                String fa = k.getText().toString();

                Intent b = new Intent(MainActivity.this, MainActivity2.class);
                b.putExtra("information n", ra);
                b.putExtra("information a", fa);
                startActivity(b);

            }
        });
    }
}