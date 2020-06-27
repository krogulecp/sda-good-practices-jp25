package info.krogulec.sda.goodpractices.designpatterns.factorymethod;

public class Main {

    public static void main(String[] args) {
        new World(new RandomEnemyFactory()).createWorld();
    }
}
