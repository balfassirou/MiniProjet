/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balfassirou.gestionformation;

/**
 *
 * @author BALFASSIROU
 * 
 */
public class Professeur  extends Personne
{
    private String specialite; 
    
    public Professeur ()
    {
        super();
    }
    public Professeur (int id, String matricule, String prenom, String nom, String dateNaissance, 
                     String lieuNaissance, String adresse, String telephone, String email, 
                     String nationalite, String genre, String situationMatrimoniale,String specialite)
    {
     super(id, matricule, prenom, nom,
            dateNaissance, lieuNaissance, adresse, telephone,
            email, nationalite, genre, situationMatrimoniale);
      this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpecialite: " + specialite ;
    }
    
}
