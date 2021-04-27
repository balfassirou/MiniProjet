/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balfassirou.gestionformation.interfaces;

import com.balfassirou.gestionformation.Professeur;
import java.util.List;


/**
 *
 * @author MHDN
 */
public interface IProfesseur {
      void addProfesseur(Professeur professeur);
      void updateProfesseur(Professeur professeur);
     public Professeur getProfesseurById(int id);
      void removeProfesseur(Professeur professeur);
     public List<Professeur> getAllProfesseur();
    
}
