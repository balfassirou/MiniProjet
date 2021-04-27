/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balfassirou.gestionformation;

/**
 *
 * @author MHDN
 */
public class Groupe
{
    private int id;
    private String nomGroupe;
    private String dateCreation;
    private int nombreEtudiant;

    public Groupe(int id,String nomGroupe, String dateCreation, int nombreEtudiant)
    {
        this.id= id;
        this.nomGroupe = nomGroupe;
        this.dateCreation = dateCreation;
        this.nombreEtudiant = nombreEtudiant;
    }

    public int getId() {
        return id;
    }

    public void setId(int idGroupe) {
        this.id = id;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getNombreEtudiant() {
        return nombreEtudiant;
    }

    public void setNombreEtudiant(int nombreEtudiant) {
        this.nombreEtudiant = nombreEtudiant;
    }

    @Override
    public String toString() {
        return  "idG: " + id + "\nNomGroupe: " + nomGroupe + "\nDateCreation: " + dateCreation + "\nNombreEtudiant: " + nombreEtudiant;
    }
    
    
   
    
}


