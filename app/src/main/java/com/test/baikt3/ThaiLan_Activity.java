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

public class ThaiLan_Activity extends AppCompatActivity {
    EditText edt_vd;
    Button btnluu;
    ListView listView;
    ImageView im_back;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thai_lan);

        edt_vd = findViewById(R.id.edt_tl);
        btnluu = findViewById(R.id.button_luu_tl);
        im_back = findViewById(R.id.ig_back_tl);
        listView = findViewById(R.id.listView_tl);
        arrayList = new ArrayList<>();

        arrayList.add("นอนหลับฝันดีนะ!");
        arrayList.add("ยินดีที่ได้รู้จักคุณ");

        ArrayAdapter adapter = new ArrayAdapter(
                ThaiLan_Activity.this,
                android.R.layout.simple_list_item_1,
                arrayList
        );
        listView.setAdapter(adapter);

        btnluu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tl = edt_vd.getText().toString();
                arrayList.add(tl);
                adapter.notifyDataSetChanged();
            }
        });

        im_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThaiLan_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}