package com.sulavswastha.sulavswastha;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Home extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mToolbar= (Toolbar) findViewById(R.id.home_toolbar);
        mToolbar.setTitle("Home");
        setSupportActionBar(mToolbar);

        mDrawerLayout= (DrawerLayout) findViewById(R.id.drawer_layout);
        mToggle=new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClickHospitalListener(View view) {
        Intent i_hospital=new Intent(this,Hospital.class);

        startActivity(i_hospital);
    }

    public void onClickHomeButton(MenuItem item) {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    public void onClickBloodDonorsListener(MenuItem item) {
        Intent i_blooddonors=new Intent(this,BloodDonors.class);
        mDrawerLayout.closeDrawer(GravityCompat.START);
        startActivity(i_blooddonors);
    }

    public void onClickDonateBloodListener(MenuItem item) {
        Intent i_donateblood=new Intent(this,DonateBlood.class);
        mDrawerLayout.closeDrawer(GravityCompat.START);
        startActivity(i_donateblood);
    }

    public void onClickMedicineReminder(MenuItem item) {
        Intent i_medicinereminder=new Intent(this,MedicineReminder.class);
        mDrawerLayout.closeDrawer(GravityCompat.START);
        startActivity(i_medicinereminder);
    }

    public void onClickNewsListener(MenuItem item) {
        Intent i_news=new Intent(this,News.class);
        mDrawerLayout.closeDrawer(GravityCompat.START);
        startActivity(i_news);
    }

    public void onClickAboutUsListener(MenuItem item) {
        Intent i_aboutus=new Intent(this,AboutUs.class);
        mDrawerLayout.closeDrawer(GravityCompat.START);
        startActivity(i_aboutus);
    }

    public void onClickDoctorListener(View view) {
        Intent i_Doctor=new Intent(this,Doctor.class);
        startActivity(i_Doctor);
    }

    public void onClickMedicineListener(View view) {
        Intent i_Medicine=new Intent(this,Medicine.class);
        startActivity(i_Medicine);
    }

    public void onClickDiseasesListener(View view) {
        Intent i_diseases=new Intent(this,Disease.class);
        startActivity(i_diseases);
    }
}
