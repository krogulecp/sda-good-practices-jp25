package info.krogulec.sda.goodpractices.designpatterns.singleton;

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy(){
        System.out.println("init...");
    }

    public static SingletonLazy getInstance(){
        if (instance == null){
            synchronized (SingletonLazy.class){
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }

    // logika
}
