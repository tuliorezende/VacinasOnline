package com.example.tulior.vacinasonline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.tulior.vacinasonline.Fragments.AboutVaccineFragment;
import com.example.tulior.vacinasonline.Fragments.CreateVaccineFragment;
import com.example.tulior.vacinasonline.Fragments.MainMenuFragment;
import com.example.tulior.vacinasonline.Fragments.ShowPersonVaccinesFragment;
import com.example.tulior.vacinasonline.Fragments.UpdateProfileFragment;
import com.example.tulior.vacinasonline.Fragments.VaccineLocationFragment;

public class MainMenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);

        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentTransaction fragmentManager = getSupportFragmentManager().beginTransaction();
        fragmentManager.replace(R.id.basicLayout, new ShowPersonVaccinesFragment());
        fragmentManager.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        FragmentManager fragmentManager = getSupportFragmentManager();

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id) {
            case R.id.nav_person_list_vaccine:
                fragmentManager.beginTransaction().replace(R.id.basicLayout, new ShowPersonVaccinesFragment()).commit();
                break;
            case R.id.nav_vaccine_local:
                fragmentManager.beginTransaction().replace(R.id.basicLayout, new VaccineLocationFragment()).commit();
                break;
            case R.id.nav_about_vaccine:
                fragmentManager.beginTransaction().replace(R.id.basicLayout, new AboutVaccineFragment()).commit();
                break;
            case R.id.nav_vaccine_status_legend:
                fragmentManager.beginTransaction().replace(R.id.basicLayout, new MainMenuFragment()).commit();
                break;
            case R.id.nav_editprofile:
                fragmentManager.beginTransaction().replace(R.id.basicLayout, new UpdateProfileFragment()).commit();
                break;
            case R.id.nav_add_vaccine:
                fragmentManager.beginTransaction().replace(R.id.basicLayout, new CreateVaccineFragment()).commit();
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void sendToLoginAccount(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

        finish();
    }

}
