package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private CheckBox mItem1,mItem2,mItem3,mItem4,mItem5,mItem6,mItem7,mItem8,mItem9;
    public static final String mItems = "com.example.android.shoppinglist.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        mItem1 = findViewById(R.id.checkBox);
        mItem2 = findViewById(R.id.checkBox2);
        mItem3 = findViewById(R.id.checkBox3);
        mItem4 = findViewById(R.id.checkBox4);
        mItem5 = findViewById(R.id.checkBox5);
        mItem6 = findViewById(R.id.checkBox6);
        mItem7 = findViewById(R.id.checkBox7);
        mItem8 = findViewById(R.id.checkBox8);
        mItem9 = findViewById(R.id.checkBox9);

    }

    public void finish(View view) {
        Intent intent = new Intent();
        String items="";
        if(mItem1.isChecked()){
            items+=mItem1.getText().toString()+"\n";
        }
        if(mItem2.isChecked()){
            items+=mItem2.getText().toString()+"\n";
        }
        if(mItem3.isChecked()){
            items+=mItem3.getText().toString()+"\n";
        }
        if(mItem4.isChecked()){
            items+=mItem4.getText().toString()+"\n";
        }
        if(mItem5.isChecked()){
            items+=mItem5.getText().toString()+"\n";
        }
        if(mItem6.isChecked()){
            items+=mItem6.getText().toString()+"\n";
        }
        if(mItem7.isChecked()){
            items+=mItem7.getText().toString()+"\n";
        }
        if(mItem8.isChecked()){
            items+=mItem8.getText().toString()+"\n";
        }
        if(mItem9.isChecked()){
            items+=mItem9.getText().toString()+"\n";
        }
        intent.putExtra(mItems,items);
        setResult(RESULT_OK,intent);
        finish();
    }
}
