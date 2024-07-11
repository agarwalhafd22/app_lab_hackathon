package com.example.scrollvertical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newitem (View view)
    {
        Toast.makeText(this, "Adding new item", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this, New_Item.class);
        startActivity(intent);
    }

    public void bottle (View view)
    {
        Intent bottle=new Intent(this, Main_bottle.class);
        startActivity(bottle);
    }

    public void keys (View view)
    {
        Intent key=new Intent(this, Main_keys.class);
        startActivity(key);
    }

    public void earphones (View view)
    {
        Intent ear_phones=new Intent(this, Main_earphones.class);
        startActivity(ear_phones);
    }

    public void leader (View view)
    {
        Intent leaders=new Intent(this, leaderboard.class);
        startActivity(leaders);
    }


}