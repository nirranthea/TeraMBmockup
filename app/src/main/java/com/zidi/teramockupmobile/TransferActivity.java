package com.zidi.teramockupmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.zidi.teramockupmobile.Model.Menu;
import com.zidi.teramockupmobile.adapter.ListMenuAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class TransferActivity extends AppCompatActivity {

    private RecyclerView rvListMenu;
    private List<Menu> listMenu = new ArrayList<>();
    private ListMenuAdapter listMenuAdapter;
//    private String[] listMenuName = {"Antar Rekening Bank Teradata", "Online Antar Bank", "Kliring", "RTGS"};
    private Menu menu1 = new Menu("Antar Rekening Bank Teradata",0);
    private Menu menu2 = new Menu("Online Antar Bank",1);
    private Menu menu3 = new Menu("Kliring",2);
    private Menu menu4 = new Menu("RTGS",3);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
        listMenu.add(menu1);
        listMenu.add(menu2);
        listMenu.add(menu3);
        listMenu.add(menu4);
        rvListMenu = (RecyclerView) findViewById(R.id.rv_listmenu);
        rvListMenu.setLayoutManager(new LinearLayoutManager(this));
        listMenuAdapter = new ListMenuAdapter(this,listMenu);
        rvListMenu.setAdapter(listMenuAdapter);
        listMenuAdapter.notifyDataSetChanged();

        //Setup Toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Transfer");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
