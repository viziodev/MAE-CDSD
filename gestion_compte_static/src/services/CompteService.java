package services;

import entity.Compte;

public class CompteService {
    private static final int N=10;
    private static  Compte[] comptes=new Compte[N];
    private static int nbreCompte;

    
    private CompteService() {
        
    }

    public static  boolean addCompte(Compte compte){
     if (nbreCompte<N) {
         comptes[nbreCompte]=compte; 
         nbreCompte++;
        return true;
     }
         return false;
    }

    public static Compte[] getComptes() {
        return comptes;
    }

    public static int getNbreCompte() {
        return nbreCompte;
    }
    public static Compte getCompteByNum(String numero){
      for (int index = 0; index < nbreCompte; index++) {
          if (comptes[index].getNumero().equals(numero)) {
              return  comptes[index];
          }
      }
        return null;
    }
   
}
