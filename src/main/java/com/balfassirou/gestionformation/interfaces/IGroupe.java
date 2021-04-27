/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balfassirou.gestionformation.interfaces;

import com.balfassirou.gestionformation.Groupe;
import java.util.List;


/**
 *
 * @author MHDN
 */
public interface IGroupe {
    
     void addGroupe(Groupe groupe);
     void updateGroupe(Groupe groupe);
     public Groupe getGroupeById(int id);
     void removeGroupe(Groupe groupe);
     public List<Groupe> getAllGroupe();
}
