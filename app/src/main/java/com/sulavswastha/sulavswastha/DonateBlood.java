package com.sulavswastha.sulavswastha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DonateBlood extends AppCompatActivity {

    EditText etFirstName,etLastName,etaddress,etbloodgroup,etphoneno;
    Button btnregister,btnviewdonor;
    DatabaseHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_blood);

        Toolbar toolbar = (Toolbar) findViewById(R.id.nav_action);
        setSupportActionBar(toolbar);

        etFirstName = (EditText) findViewById(R.id.etFirstName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        etaddress = (EditText) findViewById(R.id.etAddress);
        etbloodgroup = (EditText) findViewById(R.id.etBloodGroup);
        etphoneno = (EditText) findViewById(R.id.etPhoneNo);

        btnregister = (Button) findViewById(R.id.btnRegister);
        btnviewdonor = (Button) findViewById(R.id.btnViewDonor);
        myDB = new DatabaseHelper(this);

        btnviewdonor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DonateBlood.this,BloodDonors.class);
                startActivity(intent);
            }
        });

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fName = etFirstName.getText().toString();
                String lName = etLastName.getText().toString();
                String Address = etaddress.getText().toString();
                String BloodGroup = etbloodgroup.getText().toString();
                String PhoneNo = etphoneno.getText().toString();

                if(fName.length() != 0 && lName.length() != 0 && Address.length() != 0 && BloodGroup.length() != 0&& PhoneNo.length() != 0){
                    AddData(fName,lName,Address,BloodGroup,PhoneNo);
                    etphoneno.setText("");
                    etbloodgroup.setText("");
                    etaddress.setText("");
                    etLastName.setText("");
                    etFirstName.setText("");
                }else{
                    Toast.makeText(DonateBlood.this,"You must put something in the text field!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void AddData(String firstName,String lastName, String Address, String BloodGroup, String phoneno ){
        boolean insertData = myDB.addData(firstName,lastName,Address,BloodGroup,phoneno);

        if(insertData==true){
            Toast.makeText(DonateBlood.this,"Successfully Entered Data!",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(DonateBlood.this,"Something went wrong :(.",Toast.LENGTH_LONG).show();
        }
    }
}
