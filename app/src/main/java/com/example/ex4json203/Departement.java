package com.example.ex4json203;

public class Departement {

    private String nom;
    private int nbEmp;

    public Departement() {
    }

    public Departement(String nom, int nbEmp) {
        this.nom = nom;
        this.nbEmp = nbEmp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbEmp() {
        return nbEmp;
    }

    public void setNbEmp(int nbEmp) {
        this.nbEmp = nbEmp;
    }
}
