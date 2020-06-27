package info.krogulec.sda.goodpractices.designpatterns.templatemethod;

public class Thief {
    private StealingMethod stealingMethod;

    public Thief(StealingMethod stealingMethod){
        this.stealingMethod = stealingMethod;
    }

    void steal(){
        stealingMethod.steal();
    }
}
