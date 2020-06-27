package info.krogulec.sda.goodpractices.designpatterns.singleton;

public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){
        System.out.println("Singleton jest tworzony");
    }

    public static SingletonEager getInstance(){
        return instance;
    }

    //logika
}
