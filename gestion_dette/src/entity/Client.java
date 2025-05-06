package entity;

import java.util.ArrayList;

public class Client {
    /*
     * Attribut Instance ==> Objet
     * Attribut Static   ==> Classe
     */
   private  String nom;
   private  String telephone;
   private  String adresse;
   private static  int compteur;
   private ArrayList<Dette> dettes=new ArrayList<>();

   /*
    * Methode Statique 
        //utilise  des attributs static
        //appelle des methodes static

    */
    public ArrayList<Dette> getDettes() {
      return dettes;
    }
    public void addDette(Dette dette){
          dettes.add(dette);
    }

   public static int getCompteur() {
       return compteur;
   }
   public static void setCompteur(int compteur) {
       Client.compteur = compteur;
   }
   //Constructeur par defaut ou sans arguments
   public Client() {
    }
   public String getNom() {
    return nom;
   }
   public void setNom(String nom) {
    this.nom = nom;
   }
   public String getTelephone() {
    return telephone;
   }
   public void setTelephone(String telephone) {
    this.telephone = telephone;
   }
   public String getAdresse() {
    return adresse;
   }
   public void setAdresse(String adresse) {
    this.adresse = adresse;
   }
   
   public String toChaine() {
    return "Client [nom=" + nom + ", telephone=" + telephone + ", adresse=" + adresse  + ", Total Du =" + calculMontantDu() + "]";
   }

   public double calculMontantDu(){
          double totalDu=0;
         for (int index = 0; index < dettes.size(); index++) {
            totalDu+=dettes.get(index).getMontantRestant();
         }
         return totalDu;
   }

   
}