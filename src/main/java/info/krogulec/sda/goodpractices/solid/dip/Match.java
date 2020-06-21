package info.krogulec.sda.goodpractices.solid.dip;

import java.util.List;

public class Match {

    public static void main(String[] args) {
        new SoccerGame(List.of(new Midfielder(), new Goalkeeper())).match();
    }
}
