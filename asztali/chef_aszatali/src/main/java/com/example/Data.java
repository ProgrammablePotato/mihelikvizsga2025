package com.example;

import java.sql.Date;

public class Data {
    private int id;
    private String chefname;
    private Date datum;
    private String kategoria;
    private int osszeg;
    private String megjegyzes;
    public Data(String line) {
        String[] line_split = line.split(";");
        this.id = Integer.parseInt(line_split[0]);
        this.chefname = line_split[1];
        this.datum = Date.valueOf(line_split[2]);
        this.kategoria = line_split[3];
        this.osszeg = Integer.parseInt(line_split[4]);
        this.megjegyzes = line_split[5];
    }
    public Data(int id, String chefname, Date datum, String kategoria, int osszeg, String megjegyzes) {
        this.id = id;
        this.chefname = chefname;
        this.datum = datum;
        this.kategoria = kategoria;
        this.osszeg = osszeg;
        this.megjegyzes = megjegyzes;
    }
    public Data() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getChefname() {
        return chefname;
    }
    public void setChefname(String chefname) {
        this.chefname = chefname;
    }
    public Date getDatum() {
        return datum;
    }
    public void setDatum(Date datum) {
        this.datum = datum;
    }
    public String getKategoria() {
        return kategoria;
    }
    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
    public int getOsszeg() {
        return osszeg;
    }
    public void setOsszeg(int osszeg) {
        this.osszeg = osszeg;
    }
    public String getMegjegyzes() {
        return megjegyzes;
    }
    public void setMegjegyzes(String megjegyzes) {
        this.megjegyzes = megjegyzes;
    }
    @Override
    public String toString() {
        return this.id+";"+this.chefname+";"+this.datum+";"+this.kategoria+";"+this.osszeg+";"+this.megjegyzes;
    }
}
