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

public class Doctor extends AppCompatActivity {

    private Toolbar toolbar;

    int[] IMAGES={R.drawable.doctor,R.drawable.doctor,R.drawable.doctor,R.drawable.doctor,R.drawable.doctor
            ,R.drawable.doctor,R.drawable.doctor,R.drawable.doctor,R.drawable.doctor,R.drawable.doctor
            ,R.drawable.doctor,R.drawable.doctor,R.drawable.doctor,R.drawable.doctor,R.drawable.doctor };

    String[] NAMES={"Anish Man Singh","Anup Raj Bhandari","Asso.Prof.Dr.Prakash Bista","Asso.Prof.Dr.Udayman Singh Dangol","Assoc.Prof.Babu Kaji Shrestha",
            "Dr.Barsha Suwal","Dr.Narendra Prasad Baskota","Dr.Nilam Thakur","Dr.Rajya Laxmi Sharma","Dr. Roshana Shrestha",
            "Dr.A.B.Hamal","Dr.A.E.Ansari","Dr.A.K.Gurung","Dr.Aabha Shakya","Dr.Aadarsh Shrestha"};

    String[] SPECIALIZED={"Neurologist","Clinical Psychologist/Psychotherapist","Consultant Neuro Surgeon","Orthopaedic","Opthalmologist",
            "Opthalmologist","General Surgeron","Obsterician $ Gyanaecologist","Dental","Emergency"
    ,"Physician","Cardiologist","Psychiatrist","Oncologist","Medical Officer"};

    String[] PHONENO={"9805854242,064-420250","01-5555555,01-5544477","01-4782138,9851047772","01-4221119","01-6631705,01-6639736",
            "01-4262027,014261796","01-490639","01-422365","01-4781294,01-4783024","01-5200445,01-5201809"
            ,"01-4284764","9845768709","9867564367","8976564587","89877656453"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

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
            view = getLayoutInflater().inflate(R.layout.customlayout_doctor,null);

            ImageView imageView=(ImageView) view.findViewById(R.id.imageView_doctor);
            TextView textView_name=(TextView) view.findViewById(R.id.textView_name_doctor);
            TextView textView_address=(TextView)view.findViewById(R.id.textView_specialized_doctor);
            TextView textView_phoneno=(TextView)view.findViewById(R.id.textView_phoneno_doctor);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_address.setText(SPECIALIZED[i]);
            textView_phoneno.setText(PHONENO[i]);

            return view;
        }
    }
}
