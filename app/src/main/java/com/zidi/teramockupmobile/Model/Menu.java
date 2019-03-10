package com.zidi.teramockupmobile.Model;

public class Menu {

    private String namaMenu;
    private int idMenu;

    public Menu(String namaMenu, int idMenu) {
        this.namaMenu = namaMenu;
        this.idMenu = idMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }
}
