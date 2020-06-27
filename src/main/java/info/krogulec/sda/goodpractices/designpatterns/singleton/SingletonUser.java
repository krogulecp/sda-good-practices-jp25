package info.krogulec.sda.goodpractices.designpatterns.singleton;

public class SingletonUser {

    public static void main(String[] args) {
        SingletonEager singletonEager = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();

        System.out.println("Czy singleton 1 i jest równy 2: " + (singletonEager == singletonEager2));
    }

}
