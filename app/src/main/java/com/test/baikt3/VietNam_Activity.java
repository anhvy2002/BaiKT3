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

public class VietNam_Activity extends AppCompatActivity {
    EditText edt_vd;
    Button btnluu;
    ListView listView;
    ImageView im_back;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viet_nam);

        edt_vd = findViewById(R.id.edt_vn);
        btnluu = findViewById(R.id.button_luu_vn);
        im_back = findViewById(R.id.ig_back_vn);
        listView = findViewById(R.id.listView_vn);
        arrayList = new ArrayList<>();

        arrayList.add("Anh ấy nhanh như sóc");
        arrayList.add("Chiếc xe đang chạy");


        ArrayAdapter adapter = new ArrayAdapter(
                VietNam_Activity.this,
                android.R.layout.simple_list_item_1,
                arrayList
        );
        listView.setAdapter(adapter);

        btnluu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String vn = edt_vd.getText().toString();
                arrayList.add(vn);
                adapter.notifyDataSetChanged();
            }
        });

        im_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VietNam_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}