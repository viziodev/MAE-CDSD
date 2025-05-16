<?php 
require_once "./src/entity/Compte.php";
class CompteRepository{

    public function selectAll():array{
       //1-Connexion a Mysql
    try {
        $sql="select * from compte";
        $server = 'localhost:8889';
        $dbname = 'banque_glrs_cdsa_mae_2025';
        $username = 'root';
        $password = 'root';
        $charset = 'utf8mb4';
        $chaineConnexion = "mysql:host=$server;dbname=$dbname;charset=$charset";
         $pdo = new PDO($chaineConnexion, $username, $password, [
            PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC,
         ]);

        //2-Execute la requete
         $cursor=$pdo->query($sql);
       //3-Recuperer les resultats sous form de cursor ou statement
         $comptes=[];
        while ($row=$cursor->fetch()) {
         //4-Convertir statement ou cursor en tableau de compte
           $compte=new Compte();
           $compte->setId($row["id"]);
           $compte->setSolde($row["solde"]);
           $compte->setNumero($row["numero"]);
           $compte->setDateCreation(new DateTime($row["dateCreation"]));
           $comptes[]= $compte;
        }
        return  $comptes;

    } catch (PDOException $ex) {
         print $ex->getMessage()."\n";
    }

    return [];
      
    }

    public function insert(Compte $compte):int{
        try {
            $solde=$compte->getSolde();
            $numero=$compte->getNumero();
            $dateCreation=$compte->getDateCreation()->format("Y-m-d");
            $sql="INSERT INTO `compte` (`solde`, `numero`, `dateCreation`) VALUES ($solde, '$numero', '$dateCreation')";
            $server = 'localhost:8889';
            $dbname = 'banque_glrs_cdsa_mae_2025';
            $username = 'root';
            $password = 'root';
            $charset = 'utf8mb4';
            $chaineConnexion = "mysql:host=$server;dbname=$dbname;charset=$charset";
             $pdo = new PDO($chaineConnexion, $username, $password, [
                PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC,
             ]);
            //2-Execute la requete
             return $pdo->exec($sql);
        } catch (PDOException $ex) {
             print $ex->getMessage()."\n";
        }

        return 0;
    }

    public function selectById(int $id):Compte|null{
        try {
            $sql="select * from compte where id=$id";
            $server = 'localhost:8889';
            $dbname = 'banque_glrs_cdsa_mae_2025';
            $username = 'root';
            $password = 'root';
            $charset = 'utf8mb4';
            $chaineConnexion = "mysql:host=$server;dbname=$dbname;charset=$charset";
             $pdo = new PDO($chaineConnexion, $username, $password, [
                PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC,
             ]);
    
            //2-Execute la requete
             $cursor=$pdo->query($sql);
            //3-Recuperer les resultats sous form de cursor ou statement 
              $row=$cursor->fetch();
             //4-Convertir statement ou cursor en tableau de compte
               $compte=new Compte();
               $compte->setId($row["id"]);
               $compte->setSolde($row["solde"]);
               $compte->setNumero($row["numero"]);
               $compte->setDateCreation(new DateTime($row["dateCreation"]));
              return $compte;
        } catch (PDOException $ex) {
             print $ex->getMessage()."\n";
        }

        return null;
    }
}