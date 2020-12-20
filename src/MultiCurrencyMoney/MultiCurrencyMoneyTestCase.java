package MultiCurrencyMoney;

// Target definition:
// $5 + 10 CHF = $10 if rate is 2:1
// $5 × 2 = $10

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiCurrencyMoneyTestCase {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
