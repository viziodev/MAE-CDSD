package services;

import entity.Compte;

public class CompteService {
    private final int N=10;
   

    private Compte[] comptes=new Compte[N];
    private int nbreCompte;
    

    public CompteService() {
        
    }

    public boolean addCompte(Compte compte){
     if (nbreCompte<N) {
         comptes[nbreCompte]=compte; 
         nbreCompte++;
        return true;
     }
         return false;
    }

    public Compte[] getComptes() {
        return comptes;
    }

    public int getNbreCompte() {
        return nbreCompte;
    }
    public Compte getCompteByNum(String numero){
      for (int index = 0; index < nbreCompte; index++) {
          if (comptes[index].getNumero().equals(numero)) {
              return  comptes[index];
          }
      }
        return null;
    }





    
}
