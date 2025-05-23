package entity;

import java.time.LocalDate;
import java.util.ArrayList;

import views.translation.fr.TransactionMessage;

public abstract class Compte {
    private static int nbreCompte;
    protected int id;
    protected String numero;
    protected  LocalDate dateCreation=LocalDate.now();
    protected double  solde;
    protected ArrayList<Transaction> transactions=new ArrayList<>();

    protected TypeCompte type;
   
    public TypeCompte getType() {
        return type;
    }
    protected Compte(double solde) {
        nbreCompte++;
        id=nbreCompte;
        numero="NUM_"+id;
        this.solde = solde;
    }


    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }


    public  abstract TransactionMessage retrait(Transaction transaction);
    public  abstract TransactionMessage depot(Transaction transaction);
   /*  public TransactionMessage addTransaction(Transaction transaction){
        if (nbreTransaction<N) {
           if (transaction.getType()==TypeTransaction.RETRAIT) {
                if (transaction.getMontant()<solde) {
                  transactions[nbreTransaction]=transaction; 
                  nbreTransaction++;
                  solde-=transaction.getMontant();
                 return TransactionMessage.RETRAIT_SUCCESS;  //Retrait effectue avec Success
                }
                 return TransactionMessage.RETRAIT_FAILED; //Montant Insuffisant
            }
             transactions[nbreTransaction]=transaction; 
             nbreTransaction++;
              solde+=transaction.getMontant();
              return TransactionMessage.DEPOT_SUCCESS; //Depot effectue avec Success
          }
              return TransactionMessage.TRANSACTION_FAILED; //Le Tableau est Rempli
       }
     */

       

    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    protected Compte() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public LocalDate getDateCreation() {
        return dateCreation;
    }
    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }
   
  
   

   @Override
   public String toString() {
    return "id=" + id + ", numero=" + numero + ", dateCreation=" + dateCreation + ", Solde=" + solde ;
   }



   @Override
   public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((numero == null) ? 0 : numero.hashCode());
    return result;
   }



   @Override
   public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Compte other = (Compte) obj;
    if (numero == null) {
        if (other.numero != null)
            return false;
    } else if (!numero.equals(other.numero))
        return false;
    return true;
   }

   
   
    
  


}
