package MultiCurrencyMoney;

public class Dollar extends Money {
    Dollar(int amount) {
        super(amount);
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
