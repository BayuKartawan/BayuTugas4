package com.list.bayutugas4;

public class DataBahasaPemrograman {
    String nameAlgoritma, baca_lebih_lanjut,hello_world, description, logo;

    public DataBahasaPemrograman(String nameAlgoritma, String baca_lebih_lanjut, String hello_world, String description, String logo) {
        this.nameAlgoritma = nameAlgoritma;
        this.hello_world = hello_world;
        this.baca_lebih_lanjut = baca_lebih_lanjut;
        this.description = description;
        this.logo = logo;
    }

    public String getNameAlgoritma() {
        return nameAlgoritma;
    }
    public String getDescription() {
        return description;
    }
    public String getHello_world() {
        return hello_world;
    }
    public String getBaca_lebih_lanjut() {
        return baca_lebih_lanjut;
    }
    public String getLogo() {
        return logo;
    }
}
