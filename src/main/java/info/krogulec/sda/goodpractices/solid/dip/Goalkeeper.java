package info.krogulec.sda.goodpractices.solid.dip;

public class Goalkeeper implements SoccerPlayer {
    @Override
    public void play() {
        System.out.println("Goalkeeper protects goal");
    }
}
