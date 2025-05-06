package views.translation.fr;

public enum MenuMessage {
    ADD_COMPTE("1-Ajouter  un  compte dans un Tableau"),
    SHOW_COMPTE("2-Afficher les comptes du Tableau" ),
    ADD_TRANSACTION_COMPTE("3-Ajouter une Transaction a un Compte" ),
    SHOW_TRANSACTION_COMPTE("4-Lister les  Transactions a un Compte" ),
    QUITTER("5-Quitter" ),
    CHOIX_MESSAGE("Veuilez faire un choix?");

    private MenuMessage(String message) {
        this.message = message;
    }

    private final String message;

    public String getMessage() {
        return message;
    }




}
