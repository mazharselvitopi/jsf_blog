package com.test;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class Bismillah implements Serializable {
    private final String BISMILLAH = "Bismillah her hayrın başıdır";

    public String getBISMILLAH() {
        return BISMILLAH;
    }
}
