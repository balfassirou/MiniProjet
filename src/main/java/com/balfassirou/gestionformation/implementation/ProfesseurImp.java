/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balfassirou.gestionformation.implementation;

import com.balfassirou.gestionformation.Professeur;
import com.balfassirou.gestionformation.interfaces.IProfesseur;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author MHDN
 */
public class ProfesseurImp implements IProfesseur
{
    List<Professeur> professeurs=new ArrayList<>();

    @Override
    public void addProfesseur(Professeur professeur)
    {
        professeurs.add(professeur);
    }

    @Override
    public void updateProfesseur(Professeur professeur) 
    {
        for(Professeur prof1: professeurs)
        {
            if(prof1.getId()==professeur.getId())
            {
                prof1.setMatricule(professeur.getMatricule());
                prof1.setPrenom(professeur.getPrenom());
                prof1.setNom(professeur.getNom());
                prof1.setDateNaissance(professeur.getDateNaissance());
                prof1.setLieuNaissance(professeur.getLieuNaissance());
                prof1.setAdresse(professeur.getAdresse());
                prof1.setTelephone(professeur.getTelephone());
                prof1.setEmail(professeur.getEmail());
                prof1.setNationalite(professeur.getNationalite());
                prof1.setGenre(professeur.getGenre());
                prof1.setSituationMatrimoniale(professeur.getSituationMatrimoniale());
                prof1.setSpecialite(professeur.getSpecialite());
               }
        }
    }
    @Override
    public Professeur getProfesseurById(int id)
    {
            for(Professeur professeur: professeurs)
            {
            if(professeur.getId()==id)
            {
                return professeur;
            }
            }
        return null;
        
    }

    @Override
    public void removeProfesseur(Professeur professeur)
    {
        professeurs.remove(professeur);
         
    }

    @Override
    public List<Professeur> getAllProfesseur()
    {
        return professeurs;
         
    }
    
    
}
