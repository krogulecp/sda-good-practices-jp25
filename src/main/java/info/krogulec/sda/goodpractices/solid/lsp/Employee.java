package info.krogulec.sda.goodpractices.solid.lsp;

public class Employee {

    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}