package views;

public enum MenuOption {
    ADD_COMPTE(1),
    SHOW_COMPTE(2),
    ADD_TRANSACTION_COMPTE(3),
    SHOW_TRANSACTION_COMPTE(4),
    QUITER(5),
    ERROR_MENU(0);
    
    private final int value;
    public int getValue() {
        return value;
    }

    private MenuOption(int value) {
        this.value = value;
    }
   //Convertir choix(int ) ==> MenuOption(enum)
    public static MenuOption getEnumWithValue(int value){
        MenuOption[] values = MenuOption.values();
        for (int index = 0; index < values.length; index++) {
              if (values[index].value==value) {
                  return values[index];
              }
        } 
        return MenuOption.ERROR_MENU;
    }

    

}
