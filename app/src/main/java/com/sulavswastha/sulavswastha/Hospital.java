package com.sulavswastha.sulavswastha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Hospital extends AppCompatActivity {
    private Toolbar toolbar;

    int[] IMAGES={R.drawable.hospital,R.drawable.hospital,R.drawable.hospital,R.drawable.hospital,R.drawable.hospital
            ,R.drawable.hospital,R.drawable.hospital,R.drawable.hospital,R.drawable.hospital,R.drawable.hospital};

    String[] NAMES={"AAMA BAA HOSPITAL","ALKA HOSPITAL","AYUSH HOSPITAL","BIR HOSPITAL","B.P. EYE FOUNDATION",
            "BLUE CROSS HOSPITAL","DHULIKHEL HOSPITAL","DRISTI EYE CARE CENTER","EVEREST HOSPITAL","GLOBAL HOSPITAL" };

    String[] ADDRESS={"Gorkha,Gandaki","Jwalakhel,Lalitpur","New Baneshwor, Kathmandu","Kanti Path,Kathmandu","Mandhyapur Thimi,Manahara",
            "Tripureshwor","Kathmandu","Vishwajyoti Mall,Ground Floor,Jamal","New Baneshwor,Kathmandu","Gwarko,Lalitpur"};

    String[] PHONENO={"9805854242,064-420250","01-5555555,01-5544477","01-4782138,9851047772","01-4221119","01-6631705,01-6639736",
            "01-4262027,014261796","01-490639","01-422365","01-4781294,01-4783024","01-5200445,01-5201809"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        Toolbar toolbar = (Toolbar) findViewById(R.id.nav_action);
        setSupportActionBar(toolbar);

        ListView listView=(ListView)findViewById(R.id.listview);

        CustomAdapter adapter=new CustomAdapter();

        listView.setAdapter(adapter);
    }

    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout_hospital,null);

            ImageView imageView=(ImageView) view.findViewById(R.id.imageView);
            TextView textView_name=(TextView) view.findViewById(R.id.textView_name);
            TextView textView_address=(TextView)view.findViewById(R.id.textView_address);
            TextView textView_phoneno=(TextView)view.findViewById(R.id.textView_phoneno);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_address.setText(ADDRESS[i]);
            textView_phoneno.setText(PHONENO[i]);

            return view;
        }
    }
}
