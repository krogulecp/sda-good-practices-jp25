package info.krogulec.sda.goodpractices.designpatterns.templatemethod;

public class App {

    public static void main(String[] args) {
        Thief thief = new Thief(new HitAndRunMethod());
        thief.steal();
    }
}
