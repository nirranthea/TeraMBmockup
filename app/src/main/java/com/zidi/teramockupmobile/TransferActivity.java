package com.zidi.teramockupmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.zidi.teramockupmobile.adapter.ListMenuAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransferActivity extends AppCompatActivity {

    private RecyclerView rvListMenu;
    private List<String> listMenu = new ArrayList<>();
    private ListMenuAdapter listMenuAdapter;
    private String[] listMenuName = {"menu1", "menu2", "menu3", "menu4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        listMenu.addAll(Arrays.asList(listMenuName));
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
