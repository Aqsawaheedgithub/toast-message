package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button clk1,clk2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clk1 = findViewById(R.id.UPid);
        clk2 = findViewById(R.id.DOWNid);
    }
    public void clkUP(View view)
    {
        Toast.makeText(this,"UP", Toast.LENGTH_LONG).show();

    }
    public void clkDOWN(View view)
    {
        Toast.makeText(this,"DOWN", Toast.LENGTH_SHORT).show();
    }
}