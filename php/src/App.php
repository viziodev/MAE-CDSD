<?php 
require_once "./src/service/CompteService.php";
require_once "./src/views/CompteView.php";
class App{
    /*
       public function nomFonction():typeRetour{
       }
    
    
    */

    public static function main():void{
        $compteService=new CompteService();
        do {
            //Dans la classe PHP remplace App par self
               $choix=self::menu();
               switch ($choix) {
                case '1':
                    $compte=CompteView::saisieCompte();
                    $compteService->addCompte($compte);
                    break;
                
                case '2':
                        CompteView::afficheCompte($compteService->getComptes());
                        break;
                default:
                    # code...
                    break;
               }

            # code...
        } while ($choix != 3);

    }

    public static function menu():string{
      print "1-Ajouter un compte\n";
      print "2-Lister les  comptes\n";
      print "3-Quitter\n";
      return readline("Entrer votre choix");
    }

}

//Java App.main()
//PHP  App::main()

App::main();