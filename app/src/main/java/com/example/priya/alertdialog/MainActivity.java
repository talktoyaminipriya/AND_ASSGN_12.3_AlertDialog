package com.example.priya.alertdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// On click this method is called
    public void Show(View view){

        Alert alert = new Alert();
        alert.show(getFragmentManager(), "Alert");
    }
}
