package MultiCurrencyMoney;

public class Franc extends Money {
    Franc(int amount) {
        super(amount);
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
