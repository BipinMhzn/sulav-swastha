package com.sulavswastha.sulavswastha;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user1 on 12/1/2017.
 */
public class ThreeColumn_ListAdapter extends ArrayAdapter<User> {

    private LayoutInflater mInflater;
    private ArrayList<User> users;
    private int mViewResourceId;

    public ThreeColumn_ListAdapter(Context context, int textViewResourceId, ArrayList<User> users) {
        super(context, textViewResourceId, users);
        this.users = users;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        User user = users.get(position);

        if (user != null) {
            TextView firstName = (TextView) convertView.findViewById(R.id.textFirstName);
            TextView lastName = (TextView) convertView.findViewById(R.id.textLastName);
            TextView Address = (TextView) convertView.findViewById(R.id.textAddress);
            TextView bloodGroup = (TextView) convertView.findViewById(R.id.textBloodGroup);
            TextView phoneNo = (TextView) convertView.findViewById(R.id.textPhoneNo);

            if (firstName != null) {
                firstName.setText(user.getFirstName());
            }
            if (lastName != null) {
                lastName.setText((user.getLastName()));
            }
            if (Address != null) {
                Address.setText((user.getAddress()));
            }
            if (bloodGroup != null) {
                bloodGroup.setText((user.getBloodGroup()));
            }
            if (phoneNo != null) {
                phoneNo.setText((user.getPhoneNo()));
            }
        }

        return convertView;
    }
}