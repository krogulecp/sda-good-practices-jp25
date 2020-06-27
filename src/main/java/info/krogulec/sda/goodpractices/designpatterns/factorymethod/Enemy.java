package info.krogulec.sda.goodpractices.designpatterns.factorymethod;

abstract class Enemy {
    private final String name;
    private final int power;

    Enemy(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
