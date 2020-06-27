package info.krogulec.sda.goodpractices.designpatterns.adapter;

public class Capitan {
    private final RowingBoat rowingBoat;

    public Capitan(RowingBoat rowingBoat){
        this.rowingBoat = rowingBoat;
    }

    void row(){
        rowingBoat.row();
    }
}
