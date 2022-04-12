import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCreditСalculator {
    @Test
    public void TestMonthlyPayment(){
        CreditСalculator сalculator = new CreditСalculator();
        int month = 12;
        int sumCredit = 100000;
        int percentYear = 10;
        assertEquals(9166,сalculator.monthlyPayment(sumCredit,month,percentYear));

    }

    @Test
    public void SumOverpayment(){
        CreditСalculator сalculator = new CreditСalculator();
        int month = 12;
        int sumCredit = 100000;
        int percentYear = 10;
        assertEquals(9996,сalculator.overpayment(sumCredit,month,percentYear));
    }
}
