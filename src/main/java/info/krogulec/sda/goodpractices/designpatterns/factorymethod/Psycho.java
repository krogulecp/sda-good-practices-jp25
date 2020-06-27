package info.krogulec.sda.goodpractices.designpatterns.factorymethod;

public class Psycho extends Enemy {

    private static final String NAME = "Psycho";
    private static final int POWER = 106;

    Psycho() {
        super(NAME, POWER);
    }
}
