package com.gauravsapps.cncnotes6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class card_1 extends AppCompatActivity {
    private ListView lv;
    Context context;
    ArrayList proList;

    public static Integer [] proImages = {R.drawable.one,
            R.drawable.two,
            R.drawable.three};

    public static String[] proNames= {"History and Defination" , "Applications" , "Advantages and Disadvantages"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_1);

        MyListAdapter adapter1 = new MyListAdapter(this, proNames,proImages);

        lv = (ListView) findViewById(R.id.myList);

        lv.setAdapter(adapter1);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              //  String iv = (String)lv.getItemAtPosition(i);
                if(i==0){
                    Intent c11 = new Intent(getApplicationContext(), card_1_1.class);
                    startActivity(c11);
                }
                if(i==1){
                    Intent c12=new Intent(getApplicationContext(),card_1_2.class);
                    startActivity(c12);
                }
                if(i==2){
                    Intent c13=new Intent(getApplicationContext(),card_1_3.class);
                    startActivity(c13);
                }
            }
        });
    }
}