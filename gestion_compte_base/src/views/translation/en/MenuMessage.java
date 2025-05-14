package views.translation.en;

public enum MenuMessage {
    ADD_COMPTE("1-Add  compte to Array"),
    SHOW_COMPTE("2-Show  all comptes" ),
    QUITTER("5-Quit" ),
    CHOIX_MESSAGE("Do a choice?");

    private MenuMessage(String message) {
        this.message = message;
    }

    private final String message;

    public String getMessage() {
        return message;
    }

}
