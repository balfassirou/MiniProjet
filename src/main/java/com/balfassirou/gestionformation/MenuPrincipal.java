/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balfassirou.gestionformation;

import com.balfassirou.gestionformation.implementation.EtudiantImp;
import com.balfassirou.gestionformation.implementation.GroupeImp;
import com.balfassirou.gestionformation.implementation.ProfesseurImp;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author MHDN
 */
public class MenuPrincipal
{
     public static void Menu()
     {
        System.out.println("\t\t\t\t\t\t\t*******************************************************************\n"+
                           "\t\t\t\t\t\t\t*                          ~~***~~                                *\n"+
                           "\t\t\t\t\t\t\t*               «Bienvenue sur votre apllication»                 *\n"+
                           "\t\t\t\t\t\t\t*                          ~~***~~                                *\n"+
                           "\t\t\t\t\t\t\t*                     GESTION D'UNE FORMATION                     *\n"+
                           "\t\t\t\t\t\t\t*******************************************************************\n");
        System.out.println("\t\t\t\t\t\t\t\t\t1 - GESTION GROUPE \n\t\t\t\t\t\t\t\t\t2 - GESTION ETUDIANT"
                + "\n\t\t\t\t\t\t\t\t\t3 - GESTION PROFESSEUR  \n\t\t\t\t\t\t\t\t\t4 - GESTION GROUPE-GROUPE "
                + "\n\t\t\t\t\t\t\t\t\t5 - QUITER\n");
        System.out.println("\t\t\t\t\t\t\t\t=====***Veuller choisur votre Option SVP:***=====");
    }
    
     public static void main(String args[]){
         GroupeImp groupeImp=new GroupeImp();
         EtudiantImp etudiantImp=new EtudiantImp();
         ProfesseurImp professeurImp=new ProfesseurImp();
        int choix;
        Scanner entrer=new Scanner(System.in);
        
        do{
            Menu(); 
            choix=entrer.nextInt();
        
          switch(choix)
          {
              case 1:
                System.out.println("=====***Vous avez choisis la gestion des GROUPES***=====");
                System.out.println("1 - Créer un Groupe \n2 - Modifier un Groupe \n3 - Voir les détails d'un groupe \n4 - Supprimer un groupe \n5 - Afficher tous les groupes \n6 - Quitter");
                System.out.println("Taper votre choix:");
                choix = entrer.nextInt();
                 switch(choix)
                 {
                     
                     case 1:
                         System.out.println("----------Création d'un groupe----------");
                         System.out.println("Entrer l'id du groupe: ");
                         int id = entrer.nextInt();
                         System.out.println("Entrer le nom du groupe: ");
                         String nomGroupe = entrer.next();
                         System.out.println("Entrer la date de création du groupe: ");
                         String dateCreation = entrer.next();
                         System.out.println("Entrer le nombre d'étudiant groupe: ");
                         int nombreEtudiant = entrer.nextInt();
                         
                          Groupe groupe = new Groupe(id,nomGroupe, dateCreation, nombreEtudiant);
                          groupeImp.addGroupe(groupe);
                          System.out.println("Le groupe a été ajouter avec succées\n");
                          // Fin de la creation d'un groupe
                     break;
                     
                     case 2:
                         System.out.println("----------Modification d'un groupe----------");
                         System.out.println("Entrer l'id du groupe: ");
                         int idm = entrer.nextInt();
                         Groupe groupe1 = groupeImp.getGroupeById(idm);
                         System.out.println("Entrer le nom du groupe: ");
                         String nomGroupem = entrer.next();                              
                         System.out.println("Entrer la date de creatiuon du groupe: ");
                         String dateCreationm = entrer.next();
                         System.out.println("Entrer le nombre d'etudiant du groupe: ");
                         String nombreEtudianm = entrer.next();
                                                         
                         groupeImp.updateGroupe(groupe1);
                         System.out.println("Le groupe a été modifier avec succées\n");
                         // Fin de la modification d'un groupe
                       break;
                     case 3:
                         System.out.println("----------Voir les details d'un groupe----------");
                         System.out.println("Entrer l'id du groupe: ");
                         int idd = entrer.nextInt();
                         Groupe groupe2 = groupeImp.getGroupeById(idd);
                         
                          System.out.println(groupe2.getNomGroupe()+"\n "+groupe2.getDateCreation()+"\n "+groupe2.getNombreEtudiant()); 
                          System.out.println("Vous avez les details d'un groupe\n");
                          // Fin de l'affichage des details d'un groupe
                        break;
                     case 4:
                         System.out.println("----------Suppression  d'un groupe----------");
                         System.out.println("Entrer l'id du groupe: ");
                         int ids = entrer.nextInt();
                         Groupe groupe3 = groupeImp.getGroupeById(ids);
                         
                         groupeImp.removeGroupe(groupe3);
                         System.out.println("Le groupe a été supprimer avec succées\n");
                          // Fin de suppression d'un groupe
                        break;
                     case 5:
                         System.out.println("----------Afficher tous les groupes----------");
                          List<Groupe> groupes=groupeImp.getAllGroupe();
                          for(Groupe groupe4:groupes)
                          {
                          System.out.println(groupe4.getNomGroupe());
                          System.out.println("Vous avez tous les groupes\n");
                          //Fin d'affiche des groupes
                     }
                          break;
                     case 6:System.out.println("Fin: Vous avez bien quitter le programme !");
                          break;
                     default: System.out.println("Error: Veuillez faire un bon choix !");
                }
                          break;
            case 2:
               System.out.println("=====***Vous avez choisis la gestion des ETUDIANTS***=====");
               System.out.println("1 - Ajouter un etudiant \n2 - Modifier un etudiant \n3 - Voir les détails d'un etudiant \n4 - Supprimer un etudiant \n5 - Afficher tous les etudiants \n6 - Quitter");
               System.out.println("Taper votre choix:");
               Scanner choix2=new Scanner(System.in);
               choix=choix2.nextInt();
                 switch(choix)
                 {
                     case 1 : 
                          System.out.println("----------Ajout d'un etudiant----------");
                          System.out.println("Entrer l'id de l'etudiant: ");
                          int id = entrer.nextInt();
                          System.out.println("Entrer le matricule l'etudiant: ");
                          String matricule = entrer.next();
                          System.out.println("Entrer le prenom de l'etudiant: ");
                          String prenom = entrer.next();
                          System.out.println("Entrer le nom de l'etudiant: ");
                          String nom = entrer.next();
                          System.out.println("Entrer la date de naissance de l'etudiant: ");
                          String dateNaissance = entrer.next();
                          System.out.println("Entrer le lieu de naissance de l'etudiant: ");
                          String lieuNaissance = entrer.next();
                          System.out.println("Entrer l'adresse de l'etudiant: ");
                          String adresse = entrer.next();
                          System.out.println("Entrer le telephone de l'etudiant: ");
                          String telephone = entrer.next();
                          System.out.println("Entrer l'email de l'etudiant: ");
                          String email = entrer.next();
                          System.out.println("Entrer la nationalite de l'etudiant: ");
                          String nationalite = entrer.next();
                          System.out.println("Entrer le genre de l'etudiant: ");
                          String genre = entrer.next();
                          System.out.println("Entrer la situation matrimoniale de l'etudiant: ");
                          String situationMatrimoniale = entrer.next();
                          System.out.println("Entrer le groupe sangin de l'etudiant: ");
                          String groupeSanguin = entrer.next();
                                                        
                          Etudiant etudiant = new Etudiant(id, matricule, prenom, nom, dateNaissance, lieuNaissance, adresse, telephone, email, nationalite, genre, situationMatrimoniale, groupeSanguin);
                          etudiantImp.addEtudiant(etudiant);
                          System.out.println("L'etudiant a été ajouter avec succées\n");
                          /// Fin d'addition d'un etudiant
                      break;
                      
                     case 2:
                        System.out.println("----------Modification d'un etudiant----------");
                        System.out.println("Entrer l'id de l'etudiant: ");
                        int idUdp = entrer.nextInt();                   
                        Etudiant etudiant1 = etudiantImp.getEtudiantById(idUdp);
                        System.out.println("Entrer le matricule l'etudiant: ");
                        String matriculeUpd = entrer.next();
                        System.out.println("Entrer le prenom de l'etudiant: ");
                        String prenomUpd = entrer.next();
                        System.out.println("Entrer le nom de l'etudiant: ");
                        String nomUpd = entrer.next();
                        System.out.println("Entrer la date de naissance de l'etudiant: ");
                        String dateNaissanceUpd = entrer.next();
                        System.out.println("Entrer le lieu de naissance de l'etudiant: ");
                        String lieuNaissancUpde = entrer.next();
                        System.out.println("Entrer l'adresse de l'etudiant: ");
                        String adresseUpd = entrer.next();
                        System.out.println("Entrer le telephone de l'etudiant: ");
                        String telephoneUpd = entrer.next();
                        System.out.println("Entrer l'email de l'etudiant: ");
                        String emailUpd = entrer.next();
                        System.out.println("Entrer la nationalite de l'etudiant: ");
                        String nationaliteUpd = entrer.next();
                        System.out.println("Entrer le genre de l'etudiant: ");
                        String genreUpd = entrer.next();
                        System.out.println("Entrer la situation matrimoniale de l'etudiant: ");
                        String situationMatrimonialeUpd = entrer.next();
                        System.out.println("Entrer le groupe sangin de l'etudiant: ");
                        String groupeSanguinUpd = entrer.next();
                                                         
                        etudiantImp.updateEtudiant(etudiant1);
                        System.out.println("L'etudiant a été modifier avec succées\n"); 
                        /// Fin de la modification d'un etudiant
                      break;
                      case 3:
                         System.out.println(" Voire les details d'un etudiant");
                         System.out.println("Donner l'id de l'etudiant");
                         int idg=entrer.nextInt();
                           Etudiant etudiant4=etudiantImp.getEtudiantById(idg);
                           System.out.println(etudiant4.getId()+"\n"+etudiant4.getMatricule()+"\n"+ etudiant4.getPrenom() +"\n"+
                                   etudiant4.getNom() +"\n"+ etudiant4.getDateNaissance() +"\n"+ etudiant4.getLieuNaissance() +"\n"+ 
                                   etudiant4.getAdresse() +"\n"+ etudiant4.getTelephone() +"\n"+ etudiant4.getEmail() +"\n"+etudiant4.getNationalite() +"\n"+ 
                                   etudiant4.getGenre() +"\n"+ etudiant4.getSituationMatrimoniale() +"\n"+ etudiant4.getGroupeSanguin()); 
                           System.out.println("Vous avez les details d'un etudiant\n");
                          // Fin de l'affichage des details d'un etudiant
                           break;
                           case 4:
                                  System.out.println("----------Supprimer un etudiant----------");
                                  System.out.println("Donner l'id du groupe");
                                  int iddel=entrer.nextInt();
                                  Etudiant etudiant3=etudiantImp.getEtudiantById(iddel);
                           
                                  etudiantImp.removeEtudiant(etudiant3);
                                  System.out.println("Le groupe a été ajouter avec succées\n");
                                   /// Fin de la suppresion d'un etudiant
                            break;
                           case 5:System.out.println(" Afficher tous les etudiants");
                           List<Etudiant> etudiants=etudiantImp.getAllEtudiant();
                           for(Etudiant etudiant2:etudiants){
                           System.out.println(etudiant2.getId()+"\n"+etudiant2.getMatricule()+"\n"+ etudiant2.getPrenom() +"\n"+
                                   etudiant2.getNom() +"\n"+ etudiant2.getDateNaissance() +"\n"+ etudiant2.getLieuNaissance() /*+"\n"+ 
                                   etudiant2.getAdresse() +"\n"+ etudiant2.getTelephone() +"\n"+ etudiant2.getEmail() +"\n"+etudiant2.getNationalite() +"\n"+ 
                                   etudiant2.getGenre() +"\n"+ etudiant2.getSituationMatrimoniale() +"\n"+ etudiant2.getGroupeSanguin()*/); 
                          System.out.println("Vous avez tous les etudiants\n");
                           }
                           break;
                           case 6:System.out.println("Fin: Vous avez bien quitter le programme !");
                           System.exit(0);
                      break;
                      default:System.out.println("Error: Veuillez faire un bon choix !");
                          break;
                 }
                 break;
                 
                 
            case 3:
                
                 System.out.println("=====***Vous avez choisis la gestion des PROFESSEURS***=====");
                 System.out.println("1 - Ajouter un professeur \n2 - Modifier un professeur \n3 - Voir les détails d'un professeur \n4 - Supprimer un professeur \n5 - Afficher tous les professeurs \n6 - Quitter");
                 System.out.println("Taper votre choix:");
		 //int choix3 = entrer.nextInt();
                 Scanner choix3=new Scanner(System.in);
                 choix=choix3.nextInt();
                 switch(choix){
                      case 1:
                          System.out.println("----------Ajout d'un professeur----------");
                          System.out.println("Entrer l'id du professeur: ");
                          int id = entrer.nextInt();
                          System.out.println("Entrer le matricule du professeur: ");
                          String matricule = entrer.next();
                          System.out.println("Entrer le prenom du professeur: ");
                          String prenom = entrer.next();
                          System.out.println("Entrer le nom du professeur: ");
                          String nom = entrer.next();
                          System.out.println("Entrer la date de naissance du professeur: ");
                          String dateNaissance = entrer.next();
                          System.out.println("Entrer le lieu de naissance du professeur: ");
                          String lieuNaissance = entrer.next();
                          System.out.println("Entrer l'adresse du professeur: ");
                          String adresse = entrer.next();
                          System.out.println("Entrer le telephone du professeur: ");
                          String telephone = entrer.next();
                          System.out.println("Entrer l'email du professeur: ");
                          String email = entrer.next();
                          System.out.println("Entrer la nationalite du professeur: ");
                          String nationalite = entrer.next();
                          System.out.println("Entrer le genre du professeur: ");
                          String genre = entrer.next();
                          System.out.println("Entrer la situation matrimoniale du professeur: ");
                          String situationMatrimoniale = entrer.next();
                          System.out.println("Entrer le specialité du professeur: ");
                          String specialite = entrer.next();
                          
                          Professeur professeur = new Professeur(id, matricule, prenom, nom, dateNaissance, lieuNaissance, adresse, telephone, email, nationalite, genre, situationMatrimoniale, specialite);
                          professeurImp.addProfesseur(professeur);
                          System.out.println("Le professeur a été ajouter avec succées\n");
                          /// Fin d'addition d'un professeur
                          break;
                      case 2:
                        System.out.println("----------Modification d'un professeur----------");
                        System.out.println("Entrer l'id de l'etudiant: ");
                        int idUpd = entrer.nextInt();                   
                        Professeur professeur1 = professeurImp.getProfesseurById(idUpd);
                        System.out.println("Entrer le matricule l'etudiant: ");
                        String matriculeUpd = entrer.next();
                        System.out.println("Entrer le prenom de l'etudiant: ");
                        String prenomUpd = entrer.next();
                        System.out.println("Entrer le nom de l'etudiant: ");
                        String nomUpd = entrer.next();
                        System.out.println("Entrer la date de naissance de l'etudiant: ");
                        String dateNaissanceUpd = entrer.next();
                        System.out.println("Entrer le lieu de naissance de l'etudiant: ");
                        String lieuNaissancUpde = entrer.next();
                        System.out.println("Entrer l'adresse de l'etudiant: ");
                        String adresseUpd = entrer.next();
                        System.out.println("Entrer le telephone de l'etudiant: ");
                        String telephoneUpd = entrer.next();
                        System.out.println("Entrer l'email de l'etudiant: ");
                        String emailUpd = entrer.next();
                        System.out.println("Entrer la nationalite de l'etudiant: ");
                        String nationaliteUpd = entrer.next();
                        System.out.println("Entrer le genre de l'etudiant: ");
                        String genreUpd = entrer.next();
                        System.out.println("Entrer la situation matrimoniale de l'etudiant: ");
                        String situationMatrimonialeUpd = entrer.next();
                        System.out.println("Entrer le groupe sangin de l'etudiant: ");
                        String groupeSanguinUpd = entrer.next();
                                                         
                        professeurImp.updateProfesseur(professeur1);
                        System.out.println("L'etudiant a été modifier avec succées\n"); 
                        /// Fin de la modification d'un etudiant
                      break;
                      case 3:
                          System.out.println("----------Voir les détails d'un professeur----------");
                          System.out.println("Donner l'id du professeur");
                          int ide=entrer.nextInt();
                          Professeur professeur2 = professeurImp.getProfesseurById(ide);
                           System.out.println(professeur2.getId()+"\n"+professeur2.getMatricule()+"\n"+ professeur2.getPrenom() +"\n"+
                                   professeur2.getNom() +"\n"+ professeur2.getDateNaissance() +"\n"+ professeur2.getLieuNaissance() +"\n"+ 
                                   professeur2.getAdresse() +"\n"+ professeur2.getTelephone() +"\n"+ professeur2.getEmail() +"\n"+professeur2.getNationalite() +"\n"+ 
                                   professeur2.getGenre() +"\n"+ professeur2.getSituationMatrimoniale() +"\n"+ professeur2.getSpecialite()); 
                           System.out.println("Vous avez les details d'un professeur\n");
                          // Fin de l'affichage des details d'un professeur
                      break;
                      case 4:
                          System.out.println("----------Supprimer un professeur----------");
                          System.out.println("Donner l'id du groupe");
                          int iddele=entrer.nextInt();
                          Professeur professeur3=professeurImp.getProfesseurById(iddele);
                           
                          professeurImp.removeProfesseur(professeur3);
                          System.out.println("Le professeur a été avec succées\n");
                          /// Fin de la suppresion d'un professeur
                      break;
                      case 5:System.out.println(" Afficher tous les professeurs");
                           List<Professeur> professeurs=professeurImp.getAllProfesseur();
                           for(Professeur professeur5:professeurs){
                           System.out.println(professeur5.getPrenom()+" "+professeur5.getNom());
                           };break;
                      case 6:System.out.println("Fin: Vous avez bien quitter le programme !");
                              System.exit(0);break;
                      default:System.out.println("Veuillez choisit un numero valide !!!");break;
                 }
                 break;
                 
                 
            case 4:
               System.out.println("=====***Vous avez choisis la gestion des GROUPES-ETUDIANTS***=====");
               System.out.println("1 - Créer un Groupe-Etudiant \n2 - Modifier un Groupe-Etudiant \n3 - Voir les détails d'un Groupe-Etudiant  \n4 - Supprimer un Groupe-Etudiant \n5 - Afficher tous les Groupes-Etudiants \n6 - Quitter");
               System.out.println("Taper votre choix:");
               int choix4 = entrer.nextInt();
                 //Scanner en=new Scanner(System.in);
                 choix4=entrer.nextInt();
                 switch(choix){
                      case 1 : System.out.println("----------Ajout d'un Groupe-Etudiant----------");
                          break;
                          
                      case 2 : System.out.println("----------Modification d'un Groupe-Etudiant----------");
                          break;
                          
                      case 3 : System.out.println("----------Voir les détails d'un Groupe-Etudiant----------");
                            break;
                      case 4 : System.out.println("----------Supprimer un Groupe-Etudiant----------");
                                                    
                           break;
                                               
                      case 5 : System.out.println("----------Afficher tous les Groupe-Etudiant----------");
                                                    
                           break;
                                              
                      case 6 : System.out.println("Fin: Vous avez bien quitter le programme !");
                                                   
                           break;
                                           //     case 9 : arret = true; break;
                                                default : System.out.println("Error: Veuillez faire un bon choix !");
                 }
                 break;
                 
            case 5: System.out.println("A la prochaine !");
            System.exit(0);break;
            default: System.out.println("Veuillez choisir entre 1 et 5");break;
            }
        }
        while(choix!=5);
        
        }
    
}
