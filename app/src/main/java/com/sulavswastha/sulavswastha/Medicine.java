package com.sulavswastha.sulavswastha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Medicine extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);

        Toolbar toolbar = (Toolbar) findViewById(R.id.nav_action);
        setSupportActionBar(toolbar);

        listView= (ListView) findViewById(R.id.ListView_Medicine);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(Medicine.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.medicines));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                                Intent intent=new Intent(Medicine.this,SecondActivityMedicine.class);
                                                intent.putExtra("MedicineName", listView.getItemAtPosition(i).toString());
                                                startActivity(intent);
                                            }
                                        }

       );
        listView.setAdapter(mAdapter);
    }
}
