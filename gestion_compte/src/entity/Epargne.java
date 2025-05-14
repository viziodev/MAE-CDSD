package entity;

import java.time.LocalDate;

import views.translation.fr.TransactionMessage;

public class Epargne extends Compte {
//4

    private int duree;//mois
    private LocalDate dateDbBlocage;
    private LocalDate dateFinBlocage;
    public Epargne(double solde, int duree) {
        super(solde);
        this.dateDbBlocage=LocalDate.now();
        this.duree = duree;
        this.dateFinBlocage=this.dateDbBlocage.plusMonths(duree);
        type=TypeCompte.EPARGNE;
    }

    @Override
    public TransactionMessage retrait(Transaction transaction) {
        //Retait est impossible si la date de la transaction est entre 
        //la date de debut de blocage et la date de fin de blocage
        if (transaction.getDate().isAfter(dateDbBlocage) &&  transaction.getDate().isBefore(dateFinBlocage) ) return TransactionMessage.TRANSACTION_FAILED;
        if (transaction.getMontant()>solde) return TransactionMessage.RETRAIT_FAILED; 
        
         transactions.add(transaction);
         solde-=(transaction.getMontant());
         return TransactionMessage.RETRAIT_SUCCESS; 
    }

    @Override
    public TransactionMessage depot(Transaction transaction) {
        solde+=(transaction.getMontant());
        return TransactionMessage.DEPOT_SUCCESS;
    }

    @Override
    public String toString() {
        return "Epargne [duree=" + duree + ", dateDbBlocage=" + dateDbBlocage + ", id=" + id + ", dateFinBlocage="
                + dateFinBlocage + ", numero=" + numero + ", dateCreation=" + dateCreation + ", solde=" + solde + "]";
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public LocalDate getDateDbBlocage() {
        return dateDbBlocage;
    }

    public void setDateDbBlocage(LocalDate dateDbBlocage) {
        this.dateDbBlocage = dateDbBlocage;
    }

    public LocalDate getDateFinBlocage() {
        return dateFinBlocage;
    }

    public void setDateFinBlocage(LocalDate dateFinBlocage) {
        this.dateFinBlocage = dateFinBlocage;
    }
    
}
