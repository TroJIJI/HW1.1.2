package com.example.android11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class third extends AppCompatActivity {
    private EditText et;
    public static final String TEXT = "text";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        et = findViewById(R.id.et);

        button = findViewById(R.id.btn_change);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                String text = et.getText().toString();
                if (!text.isEmpty()) {
                    intent.putExtra("text", text);
                    setResult(RESULT_OK, intent);
                    finish();
                }
            }
        });
    }
}