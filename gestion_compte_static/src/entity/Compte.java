package entity;

import java.time.LocalDate;

import views.translation.fr.TransactionMessage;

public class Compte {
    private final int N=10;
    private int id;
    private String numero="NUM_";
    private  LocalDate dateCreation=LocalDate.now();
    private double  solde;
    private Transaction[] transactions=new Transaction[N];
    private int nbreTransaction=0;

    //Nbre Compte 
    private static int nbreCompte;//0
    public Compte() {
        //Generer Id 
        nbreCompte++;
        id=nbreCompte;
        numero+=""+id;
    }


    public Transaction[] getTransactions() {
        return transactions;
    }

    public int getNbreTransaction() {
        return nbreTransaction;
    }

    public TransactionMessage addTransaction(Transaction transaction){
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

       

    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
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
   
   public boolean egal(Compte compte){
        return id==compte.getId() && compte.getNumero().equals(compte);
   }
   
   public String toChaine() {
    return "id=" + id + ", numero=" + numero + ", dateCreation=" + dateCreation + ", Solde=" + solde ;
   }

   
   
    
  


}
