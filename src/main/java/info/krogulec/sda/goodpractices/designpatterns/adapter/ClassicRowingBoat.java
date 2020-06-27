package info.krogulec.sda.goodpractices.designpatterns.adapter;

public class ClassicRowingBoat implements RowingBoat {
    @Override
    public void row() {
        System.out.println("Classic rowing boat is sailing");
    }
}
