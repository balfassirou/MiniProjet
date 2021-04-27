/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balfassirou.gestionformation.interfaces;

import com.balfassirou.gestionformation.Etudiant;
import java.util.List;


/**
 *
 * @author MHDN
 */
public interface IEtudiant {
     void addEtudiant(Etudiant etudiant);
     void updateEtudiant(Etudiant etudiant);
     public Etudiant getEtudiantById(int id);
     void removeEtudiant(Etudiant etudiant);
     public List<Etudiant> getAllEtudiant();
}
