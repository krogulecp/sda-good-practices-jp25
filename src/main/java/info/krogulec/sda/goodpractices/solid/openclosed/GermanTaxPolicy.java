package info.krogulec.sda.goodpractices.solid.openclosed;

public class GermanTaxPolicy implements TaxPolicy {

    @Override
    public double getTax() {
        return 0.15;
    }
}
