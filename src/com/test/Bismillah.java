package com.test;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class Bismillah implements Serializable {
    private final String BISMILLAH = "Bismillah her hayrın başıdır";
    private String name ;

    public String getBISMILLAH() {
        return BISMILLAH;
    }

    public String getName() {
        if (this.name == null || this.name.equals("")) return "Yahya ÖZTEMİR";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
