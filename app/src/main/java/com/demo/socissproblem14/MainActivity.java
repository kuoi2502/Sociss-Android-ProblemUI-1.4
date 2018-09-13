package com.demo.socissproblem14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    ListView lV;
    GridView grV;
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        btn.setOnClickListener(this);


        list = new ArrayList<String>();
            list.add("C/C++");
            list.add("Java");
            list.add("Android");
            list.add("IOS");

        customListView();
        customGridView();

    }
    void anhXa(){
        btn = findViewById(R.id.btn);
        lV = findViewById(R.id.lv_listView);
        grV = findViewById(R.id.grv_gridView);

    }

    void customGridView(){
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,  list);
        grV.setAdapter(adapter);

    }

    void customListView(){
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,  list);
        lV.setAdapter(adapter);
        lV.setVisibility(View.GONE);

    }

    @Override
    public void onClick(View view) {
        if(btn.getText().equals("GridView")){
            lV.setVisibility(View.INVISIBLE);
            grV.setVisibility(View.VISIBLE);
            btn.setText("ListView");
        }else{
            lV.setVisibility(View.VISIBLE);
            grV.setVisibility(View.INVISIBLE);
            btn.setText("GridView");
        }
    }

}
