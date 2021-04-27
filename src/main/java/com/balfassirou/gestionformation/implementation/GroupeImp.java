/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balfassirou.gestionformation.implementation;

import com.balfassirou.gestionformation.Groupe;
import com.balfassirou.gestionformation.interfaces.IGroupe;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author MHDN
 */
public class GroupeImp implements IGroupe
{
    
    ArrayList<Groupe> groupes=new ArrayList<>();
    
    @Override
    public void addGroupe(Groupe groupe)
    {
        groupes.add(groupe);
        
    }

    @Override 
    public void updateGroupe(Groupe groupe)
    {
         for(Groupe groupe1:groupes)
         {
            if(groupe1.getId()==groupe.getId())
            {
                groupe1.setNomGroupe(groupe.getNomGroupe());
                groupe1.setDateCreation(groupe.getDateCreation());
                groupe1.setNombreEtudiant(groupe.getNombreEtudiant());
            }
        }
    }

    @Override
    public Groupe getGroupeById(int id) 
    {
        for(Groupe groupe:groupes)
        {
            if(groupe.getId()==id)
            {
            return groupe;
            }
        }  
        return null;
    }

    @Override
    public void removeGroupe(Groupe groupe)
    {
        groupes.remove(groupe);
       
    }

    @Override
    public List<Groupe> getAllGroupe()
    {
        return groupes;
       
    }
    
}
