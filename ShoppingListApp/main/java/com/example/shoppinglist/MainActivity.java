package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mList;
    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mList = findViewById(R.id.textView);
    }

    public void add_item(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivityForResult(intent,TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode,int resultCode, Intent data) {
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == TEXT_REQUEST){
            if(resultCode == RESULT_OK){
              String str = data.getStringExtra(SecondActivity.mItems);
              mList.setText(str);
              mList.setVisibility(View.VISIBLE);
            }
        }
    }
}
