package entity;

import java.time.LocalDate;

public class Payement {
    private LocalDate date=LocalDate.now();
    private double montant;

    
    public Payement(double montant) {
        this.montant = montant;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontantDette(double montant) {
        this.montant = montant;
    }
   
    public String toChaine() {
        return "Payement [date=" + date + ", montant=" + montant + "]";
    }

    
}
