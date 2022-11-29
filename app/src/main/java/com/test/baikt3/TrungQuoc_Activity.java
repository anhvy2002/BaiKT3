package com.test.baikt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class TrungQuoc_Activity extends AppCompatActivity {
    EditText edt_vd;
    Button btnluu;
    ListView listView;
    ImageView im_back;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trung_quoc);

        edt_vd = findViewById(R.id.edt_tq);
        btnluu = findViewById(R.id.button_luu_tq);
        im_back = findViewById(R.id.ig_back_tq);
        listView = findViewById(R.id.listView_tq);
        arrayList = new ArrayList<>();

        arrayList.add("好久不见，你最近好吗？");
        arrayList.add("很忙，我们好久没见面了");


        ArrayAdapter adapter = new ArrayAdapter(
                TrungQuoc_Activity.this,
                android.R.layout.simple_list_item_1,
                arrayList
        );
        listView.setAdapter(adapter);

        btnluu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tq = edt_vd.getText().toString();
                arrayList.add(tq);
                adapter.notifyDataSetChanged();
            }
        });

        im_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrungQuoc_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}