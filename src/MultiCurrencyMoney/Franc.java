package MultiCurrencyMoney;

public class Franc extends Money {
    public Franc(int amount, String currency) {
        super(amount, currency);
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public Money times(int multiplier) {
        return new Franc(amount * multiplier, currency);
    }
}
