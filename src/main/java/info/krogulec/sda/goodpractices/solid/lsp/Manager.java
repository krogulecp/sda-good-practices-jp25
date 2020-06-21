package info.krogulec.sda.goodpractices.solid.lsp;

public class Manager extends Employee implements SalaryTaker {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void takeSalary() {
        System.out.println("Manager takes salary");
    }
}
