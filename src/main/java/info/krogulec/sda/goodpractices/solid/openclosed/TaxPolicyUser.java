package info.krogulec.sda.goodpractices.solid.openclosed;

import java.math.BigDecimal;

public class TaxPolicyUser {

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator(new GermanTaxPolicy());
        BigDecimal salary = salaryCalculator.calculateSalary(new Employee());
        System.out.println(salary);
    }
}
