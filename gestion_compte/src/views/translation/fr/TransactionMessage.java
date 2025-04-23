package views.translation.fr;

public enum TransactionMessage {
    RETRAIT_SUCCESS("Retrait effectue avec Success"),
    DEPOT_SUCCESS("Depot effectue avec Success"),
    RETRAIT_FAILED("Montant Insuffisant"),
    TRANSACTION_FAILED("Tableau est rempli");

    private final String message;

    public String getMessage() {
        return message;
    }

    private TransactionMessage(String message) {
        this.message = message;
    }


}
