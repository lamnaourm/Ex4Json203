package com.example.ex4json203;

import java.util.ArrayList;

public class Entreprise {

    private String rs;
    private String adresse;
    private ArrayList<Departement> deps = new ArrayList<>();

    public Entreprise() {
    }

    public Entreprise(String rs, String adresse, ArrayList<Departement> deps) {
        this.rs = rs;
        this.adresse = adresse;
        this.deps = deps;
    }

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Departement> getDeps() {
        return deps;
    }

    public void setDeps(ArrayList<Departement> deps) {
        this.deps = deps;
    }
}
