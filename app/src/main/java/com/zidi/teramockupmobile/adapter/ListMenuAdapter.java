package com.zidi.teramockupmobile.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zidi.teramockupmobile.Model.Menu;
import com.zidi.teramockupmobile.R;


import java.util.List;

public class ListMenuAdapter extends RecyclerView.Adapter<ListMenuHolder> {

    private Context context;
    private List<Menu> menuList;

    public ListMenuAdapter(Context context, List<Menu> menuList){
        this.context = context;
        this.menuList = menuList;
    }


    @NonNull
    @Override
    public ListMenuHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_listmenu,null);
        ListMenuHolder holder = new ListMenuHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListMenuHolder holder, int position) {
        holder.tvListMenuNama.setText(menuList.get(position).getNamaMenu());
        holder.listMenuId = menuList.get(position).getIdMenu();
    }

    @Override
    public int getItemCount() {
        return this.menuList.size();
    }

}


class ListMenuHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView tvListMenuNama;
    int listMenuId;

    ListMenuHolder(@NonNull View itemView) {
        super(itemView);
        tvListMenuNama = (TextView) itemView.findViewById(R.id.tv_listmenu_nama);
        tvListMenuNama.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Snackbar.make(view, tvListMenuNama.getText()+String.valueOf(listMenuId), Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
        
    }
}