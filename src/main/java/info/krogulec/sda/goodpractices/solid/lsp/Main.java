package info.krogulec.sda.goodpractices.solid.lsp;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager("manager");
        Volounteer volounteer = new Volounteer("volounteer");
        manager.takeSalary();
    }
}
