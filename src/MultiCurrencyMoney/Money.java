package MultiCurrencyMoney;

public abstract class Money {
    protected int amount;
    protected String currency;

    String currency() {
        return currency;
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && this.getClass() == object.getClass();
    }

    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
