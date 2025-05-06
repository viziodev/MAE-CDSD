package entity;



public enum TypeTransaction {
    DEPOT(2),RETRAIT(1);
    private final int value;
    public int getValue() {
        return value;
    }
    private TypeTransaction(int value) {
        this.value = value;
    }
    public static TypeTransaction getEnumWithValue(int value){
        TypeTransaction[] values = TypeTransaction.values();
        int index;
        for (index = 0; index < values.length; index++) {
              if (values[index].value==value) break;
        } 
        return values[index];
    }
}
