<?php 
require_once "./src/entity/Compte.php";
require_once "./src/repository/CompteRepository.php";
class CompteService{
   private CompteRepository $compteRepository;
   public function __construct()
   {
       $this->compteRepository =new CompteRepository();
   }

    public function addCompte(Compte $compte){
        $this->compteRepository->insert($compte);
    }

    /**
     * Get the value of comptes
     */
    public function getComptes(): array
    {
       return $this->compteRepository->selectAll();
    }

    
}