package entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dette {
    private static int compte=0;
    private String numero;

    private LocalDate date=LocalDate.now();
    private double montantDette;
    private double montantPaye;
    private double montantRestant;
    private ArrayList<Payement> paiements=new ArrayList<>();

    public String getNumero() {
        return numero;
    }

    public ArrayList<Payement> getPaiements() {
        return paiements;
    }

    public void addPayement(Payement payement){
        paiements.add(payement);
        montantPaye+=payement.getMontant();
        montantRestant-=payement.getMontant();
    }
    //Constructeur avec argument  ==>Surcharge
      //Instanciation + Hydratation(Donner des valeurs aux attributs)
    public Dette(double montantDette) {
        this.montantDette = montantDette;
        this.montantPaye=0;
        this.montantRestant=montantDette;
        this.numero="DETTE_"+(++compte);
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public double getMontantDette() {
        return montantDette;
    }
    public void setMontantDette(double montantDette) {
        this.montantDette = montantDette;
    }
    public double getMontantPaye() {
        return montantPaye;
    }
    public double getMontantRestant() {
        return montantRestant;
    }
    
 
    public String toChaine() {
        return "Dette [Numero=" + numero 
                + " Date= " + date 
                + ", montantDette=" + montantDette 
                + ", montantPaye=" + montantPaye
                + ", montantRestant=" + montantRestant + "]";
    }

    
    
    
}
