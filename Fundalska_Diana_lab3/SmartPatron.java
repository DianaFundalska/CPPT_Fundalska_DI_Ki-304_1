package Fundalska_Diana_lab3;

public class SmartPatron extends Patron implements SmartPatronInterface {
    private String fireMode;

    public SmartPatron() {
        super();
    }

    public SmartPatron(String caliber, int quantity, String fireMode) {
        super(caliber, quantity);
        this.fireMode = fireMode;
    }

    public String getFireMode() {
        return fireMode;
    }

    public void setFireMode(String fireMode) {
        this.fireMode = fireMode;
    }

    @Override
    public void fire() {
        if (getQuantity() > 0) {
            log("Firing in " + fireMode + " mode.");
            super.fire();
        } else {
            log("Out of ammo in " + fireMode + " mode.");
        }
    }

    @Override
    public String advancedFireMode(String mode) {
        String message;
        if (mode.equals("single shot")) {
            message = "Firing advanced single shot";
        } else if (mode.equals("burst mode")) {
            message = "Firing advanced burst mode";
        } else {
            message = "Invalid fire mode";
        }
        System.out.println(message);
        log(message + " with " + getCaliber());
        return message;
    }
}
