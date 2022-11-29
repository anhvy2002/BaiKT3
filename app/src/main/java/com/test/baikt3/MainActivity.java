package com.test.baikt3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {
    GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainGrid = (GridLayout)findViewById(R.id.mainGrid);

        setTrangThai(mainGrid);
    }

    private void setTrangThai(GridLayout mainGrid) {
        for (int i = 0;i < mainGrid.getChildCount(); i++){
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            int ii = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(ii == 0){
                        Intent intent = new Intent(MainActivity.this, VietNam_Activity.class);
                        startActivity(intent);
                    }
                    if(ii == 1){
                        Intent intent = new Intent(MainActivity.this, Nga_Activity.class);
                        startActivity(intent);
                    }
                    if(ii == 2){
                        Intent intent = new Intent(MainActivity.this, Phap_Activity.class);
                        startActivity(intent);
                    }
                    if(ii == 3){
                        Intent intent = new Intent(MainActivity.this, TrungQuoc_Activity.class);
                        startActivity(intent);
                    }
                    if(ii == 4){
                        Intent intent = new Intent(MainActivity.this, HanQuoc_Activity.class);
                        startActivity(intent);
                    }
                    if(ii == 5){
                        Intent intent = new Intent(MainActivity.this, ThaiLan_Activity.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}