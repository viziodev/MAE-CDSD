package entity;

import views.translation.fr.TransactionMessage;

public class Cheque extends Compte {
  private final  double pourcentageFrais=0.08;

  public Cheque(double solde) {
    super(solde);
    type=TypeCompte.CHEQUE;
  }


  public Cheque() {
}

  public double getPourcentageFrais() {
    return pourcentageFrais;
  }

  @Override
  public TransactionMessage retrait(Transaction transaction) {
        if (transaction.getMontant()<solde) {
            transactions.add(transaction);
           double montantFrais= transaction.getMontant()*pourcentageFrais;
           solde-=(transaction.getMontant()+montantFrais);
         return TransactionMessage.RETRAIT_SUCCESS;  //Retrait effectue avec Success
         }
         return TransactionMessage.RETRAIT_FAILED; //Montant Insuffisant
 
  }

  @Override
  public TransactionMessage depot(Transaction transaction) {
              double montantFrais= transaction.getMontant()*pourcentageFrais;
              solde+=(transaction.getMontant()-montantFrais);
              return TransactionMessage.DEPOT_SUCCESS;
  }

  @Override
  public String toString() {
    return "Cheque [pourcentageFrais=" + pourcentageFrais + ", id=" + id + ", numero=" + numero + ", dateCreation="
            + dateCreation + ", solde=" + solde + "]";
  }  

  
}
