package entity;

import java.time.LocalDate;

public class Transaction {
     private int id;
     private  LocalDate date=LocalDate.now();
     private double  montant;
     private TypeTransaction type;
     
     public int getId() {
         return id;
     }
     public void setId(int id) {
         this.id = id;
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
     public void setMontant(double montant) {
         this.montant = montant;
     }
     public TypeTransaction getType() {
         return type;
     }
     public void setType(TypeTransaction type) {
         this.type = type;
     }

     public String toChaine() {
        return "Transaction [id=" + id + ", date=" + date + ", montant=" + montant + ", type=" + type + "]";
     }

     
}
