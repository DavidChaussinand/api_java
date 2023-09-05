package com.api_spring.demo.model;

public class CarModel {

    private int id ;
    private String modele ;
    private String marque ;
    private String couleur ;




    public CarModel(int id, String modele , String marque, String couleur) {
        this.id = id;
        this.modele = modele;
        this.marque = marque;
        this.couleur = couleur;
    }





    @Override
    public String toString(){
        return "ma voiture est "+ marque + modele + "de couleur" + couleur;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
