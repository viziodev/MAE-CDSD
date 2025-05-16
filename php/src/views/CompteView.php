<?php 
require_once "./src/entity/Compte.php";
class CompteView{
    public static function saisieCompte():Compte{
       do {
           $solde=(float)readline("Veuillez entrer le solde");
       } while ($solde <= 0);
       $compte =new Compte();
       $compte->setSolde($solde);
       return  $compte ;
    }

    public static function afficheCompte(array $comptes):void
    {
        foreach ($comptes as  $compte) {
            print  $compte;
        }
    }
}