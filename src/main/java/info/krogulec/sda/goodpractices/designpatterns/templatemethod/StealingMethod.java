package info.krogulec.sda.goodpractices.designpatterns.templatemethod;

public abstract class StealingMethod {

    protected abstract String pickTarget();

    protected abstract void confuseTarget(String target);

    protected abstract void stealTheItem(String target);

    public void steal() {
        String target = pickTarget();
        confuseTarget(target);
        stealTheItem(target);
    }
}
