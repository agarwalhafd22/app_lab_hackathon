package com.example.scrollvertical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Main_bottle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottle);
    }

    public void contact(View view)
    {
        Intent number = new Intent(Intent.ACTION_DIAL);
        number.setData(Uri.parse("tel:9889420443"));
        startActivity(number);
    }

}