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

public class Phap_Activity extends AppCompatActivity {
    EditText edt_vd;
    Button btnluu;
    ListView listView;
    ImageView im_back;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phap);

        edt_vd = findViewById(R.id.edt_phap);
        btnluu = findViewById(R.id.button_luu_phap);
        im_back = findViewById(R.id.ig_back_phap);
        listView = findViewById(R.id.listView_phap);
        arrayList = new ArrayList<>();

        arrayList.add("Je parle juste un peu français");
        arrayList.add("СJe ne comprends pas");

        ArrayAdapter adapter = new ArrayAdapter(
                Phap_Activity.this,
                android.R.layout.simple_list_item_1,
                arrayList
        );
        listView.setAdapter(adapter);

        btnluu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phap = edt_vd.getText().toString();
                arrayList.add(phap);
                adapter.notifyDataSetChanged();
            }
        });

        im_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Phap_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}