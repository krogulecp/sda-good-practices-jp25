package info.krogulec.sda.goodpractices.designpatterns.adapter;

public class App {
    public static void main(String[] args) {
        Capitan capitan = new Capitan(new FishingBoatAdapter(new FishingBoat()));
        capitan.row();
    }
}
