package info.krogulec.sda.goodpractices.designpatterns.templatemethod;

public class HitAndRunMethod extends StealingMethod {
    @Override
    protected String pickTarget() {
        return "old woman";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println("Confuse: " + target);
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.println("Take purse from: " + target);
    }
}
