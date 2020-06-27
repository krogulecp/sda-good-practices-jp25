package info.krogulec.sda.goodpractices.designpatterns.decorator;

public class BasicBook implements Book {

    @Override
    public String describe() {
        return "Basic book";
    }
}
