package info.krogulec.sda.goodpractices.designpatterns.factorymethod;

public class Soldier extends Enemy {

    private static final String NAME = "Soldier";
    private static final int POWER = 77;

    Soldier() {
        super(NAME, POWER);
    }
}
