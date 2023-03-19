package com.example.scrollvertical;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class New_Item extends AppCompatActivity {

    private EditText editText;

    EditText e1, e2, e3, e4, e5;

    private final int CAMERA_REQ_CODE = 100;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_item);
        imageView=findViewById(R.id.imageView);
        e1=findViewById(R.id.item_type);
        e2=findViewById(R.id.item_description);
        e3=findViewById(R.id.item_location);
        e4=findViewById(R.id.collect_location);
        e5=findViewById(R.id.contact_number);
    }


            public void upload (View view)
            {
                Intent icamera=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(icamera, CAMERA_REQ_CODE);
            }

            public void submit (View view)
            {
                String type= e1.getText().toString();
                String description= e2.getText().toString();
                String item_locat= e3.getText().toString();
                String found_locat= e4.getText().toString();
                String contact= e5.getText().toString();
            }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode==RESULT_OK){
            if(requestCode==CAMERA_REQ_CODE){
                Bitmap img = (Bitmap)data.getExtras().get("MyHandler");
                imageView.setImageBitmap(img);
            }
        }
    }
}