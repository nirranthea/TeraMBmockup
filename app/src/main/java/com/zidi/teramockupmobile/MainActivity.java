package com.zidi.teramockupmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    private ImageView
            menuMyAccount, menuTransfer, menuBillPayment, menuTopUp, menuSetting, menuContactUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        menuMyAccount   = (ImageView) findViewById(R.id.iv_menu1);
        menuTransfer    = (ImageView) findViewById(R.id.iv_menu2);
        menuBillPayment = (ImageView) findViewById(R.id.iv_menu3);
        menuTopUp       = (ImageView) findViewById(R.id.iv_menu4);
        menuSetting     = (ImageView) findViewById(R.id.iv_menu5);
        menuContactUs   = (ImageView) findViewById(R.id.iv_menu6);
        menuMyAccount.setOnClickListener(this);
        menuTransfer.setOnClickListener(this);
        menuBillPayment.setOnClickListener(this);
        menuTopUp.setOnClickListener(this);
        menuSetting.setOnClickListener(this);
        menuContactUs.setOnClickListener(this);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Snackbar.make(findViewById(R.id.main_activity), "Home's Action not defined yet", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        } else if (id == R.id.nav_my_accounts) {
            Intent myAccountIntent = new Intent(MainActivity.this, MyAccountActivity.class);
            startActivity(myAccountIntent);
        } else if (id == R.id.nav_transfer) {
            Intent transferIntent = new Intent(MainActivity.this, TransferActivity.class);
            startActivity(transferIntent);
        } else if (id == R.id.nav_bill_payment) {
            Snackbar.make(findViewById(R.id.main_activity), "Bill Payment's Action not defined yet", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        } else if (id == R.id.nav_topup) {
            Snackbar.make(findViewById(R.id.main_activity), "Topup's Action not defined yet", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        } else if (id == R.id.nav_notifications) {
            Snackbar.make(findViewById(R.id.main_activity), "Notifications's Action not defined yet", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        } else if (id == R.id.nav_settings) {
            Snackbar.make(findViewById(R.id.main_activity), "Settings's Action not defined yet", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        } else if (id == R.id.nav_faq) {
            Snackbar.make(findViewById(R.id.main_activity), "FAQ's Action not defined yet", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        } else if (id == R.id.nav_contact_us) {
            Snackbar.make(findViewById(R.id.main_activity), "Contact Us's Action not defined yet", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        } else if (id == R.id.nav_logout) {
            Snackbar.make(findViewById(R.id.main_activity), "Logout's Action not defined yet", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_menu1:
                Intent myAccountIntent = new Intent(MainActivity.this, MyAccountActivity.class);
                startActivity(myAccountIntent);
                break;
            case R.id.iv_menu2:
                Intent transferIntent = new Intent(MainActivity.this, TransferActivity.class);
                startActivity(transferIntent);
                break;
            case R.id.iv_menu3:
                break;
            case R.id.iv_menu4:
                break;
            case R.id.iv_menu5:
                break;
            case R.id.iv_menu6:
                break;
        }
    }
}
