package info.krogulec.sda.goodpractices.designpatterns.factorymethod;

public class Zombie extends Enemy {

    private static final String NAME = "Zombie";
    private static final int POWER = 195;

    Zombie() {
        super(NAME, POWER);
    }
}
