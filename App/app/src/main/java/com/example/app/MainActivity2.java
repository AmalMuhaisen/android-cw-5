package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView something = findViewById(R.id.textView4);
        TextView mmm = findViewById(R.id.textView6);
        TextView q = findViewById(R.id.textView5);
        Button o = findViewById(R.id.button2);



        Bundle aj = getIntent().getExtras();
        String am = aj.getString("information n");
        String nm = aj.getString("information a");

        q.setText(" hi "+ am + "  هذه معلوماتك الشخصية");

        something.setText(am);
        mmm.setText(nm);

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y = new Intent( MainActivity2.this, MainActivity.class);
                startActivity(y);
            }
        });
    }
}