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
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
}
