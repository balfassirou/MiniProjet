/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balfassirou.gestionformation.implementation;

import com.balfassirou.gestionformation.Etudiant;
import com.balfassirou.gestionformation.interfaces.IEtudiant;
import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author MHDN
 */
public class EtudiantImp implements IEtudiant
{
    List<Etudiant> etudiants=new ArrayList<>();

    @Override
    public void addEtudiant(Etudiant etudiant)
    {
       etudiants.add(etudiant);
    }

    @Override
    public void updateEtudiant(Etudiant etudiant)
    {
        for(Etudiant etudiant1: etudiants)
        {
            if(etudiant1.getId()==etudiant.getId())
            {
               etudiant1.setMatricule(etudiant.getMatricule());
               etudiant1.setPrenom(etudiant.getPrenom());
               etudiant1.setNom(etudiant.getNom());
               etudiant1.setDateNaissance(etudiant.getDateNaissance());
               etudiant1.setLieuNaissance(etudiant.getLieuNaissance());
               etudiant1.setAdresse(etudiant.getAdresse());
               etudiant1.setTelephone(etudiant.getTelephone());
               etudiant1.setEmail(etudiant.getEmail());
               etudiant1.setNationalite(etudiant.getNationalite());
               etudiant1.setGenre(etudiant.getGenre());
               etudiant1.setSituationMatrimoniale(etudiant.getSituationMatrimoniale());
               etudiant1.setGroupeSanguin(etudiant.getGroupeSanguin());
            }
        }
    }

    @Override
    public Etudiant getEtudiantById(int id) 
    {
        for(Etudiant etudiant2:etudiants){
            if(etudiant2.getId()==id)
            {
                return etudiant2;
            }
        }
        return null;
        
    }

    @Override
    public void removeEtudiant(Etudiant etudiant) {
     etudiants.remove(etudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiants;
       
    }

   
   
}
