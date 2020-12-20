package MultiCurrencyMoney;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier, currency);
    }
}
