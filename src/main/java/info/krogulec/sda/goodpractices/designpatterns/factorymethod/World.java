package info.krogulec.sda.goodpractices.designpatterns.factorymethod;

import java.util.stream.IntStream;

public class World {

    private final EnemyFactory enemyFactory;

    public World(EnemyFactory enemyFactory) {
        this.enemyFactory = enemyFactory;
    }

    void createWorld(){
        IntStream.iterate(0, i -> i + 1)
                .forEach(i -> System.out.println(enemyFactory.createEnemy()));
    }
}
