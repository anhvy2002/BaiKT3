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

public class HanQuoc_Activity extends AppCompatActivity {
    EditText edt_vd;
    Button btnluu;
    ListView listView;
    ImageView im_back;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_han_quoc);

        edt_vd = findViewById(R.id.edt_hq);
        btnluu = findViewById(R.id.button_luu_hq);
        im_back = findViewById(R.id.ig_back_hq);
        listView = findViewById(R.id.listView_hq);
        arrayList = new ArrayList<>();

        arrayList.add("즐겁게보내새요!");
        arrayList.add("김선생님 여기 계세요?");

        ArrayAdapter adapter = new ArrayAdapter(
                HanQuoc_Activity.this,
                android.R.layout.simple_list_item_1,
                arrayList
        );
        listView.setAdapter(adapter);

        btnluu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hq = edt_vd.getText().toString();
                arrayList.add(hq);
                adapter.notifyDataSetChanged();
            }
        });

        im_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HanQuoc_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}