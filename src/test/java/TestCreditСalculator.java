import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCreditСalculator {
    @Test
    public void TestMonthlyPayment(){
        CreditCalculator calculator = new CreditCalculator();
        int month = 12;
        int sumCredit = 100000;
        assertEquals(9166,calculator.monthlyPayment(sumCredit,month));

    }

    @Test
    public void SumOverpayment(){
        CreditCalculator calculator = new CreditCalculator();
        int month = 12;
        int sumCredit = 100000;
        assertEquals(9996,calculator.overpayment(sumCredit,month));
    }
}
