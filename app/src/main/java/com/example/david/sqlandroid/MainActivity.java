package com.example.david.sqlandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.david.sqlandroid.Activities.ConsultActivity;
import com.example.david.sqlandroid.Activities.ConsultListViewActivity;
import com.example.david.sqlandroid.Activities.ConsultSpinnerActivity;
import com.example.david.sqlandroid.Activities.InsertActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnInsert:
                Intent insertar = new Intent(MainActivity.this, InsertActivity.class);
                startActivity(insertar);
                break;
            case R.id.btnConsult:
                Intent consultar = new Intent(MainActivity.this, ConsultActivity.class);
                startActivity(consultar);
                break;
            case R.id.btnConsultSpinner:
                Intent spinner = new Intent(MainActivity.this, ConsultSpinnerActivity.class);
                startActivity(spinner);
                break;
            case R.id.btnConsultList:
                Intent listView = new Intent(MainActivity.this, ConsultListViewActivity.class);
                startActivity(listView);
        }
    }
}
