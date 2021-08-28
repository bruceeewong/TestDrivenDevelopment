package MultiCurrencyMoney;

import java.util.Objects;

public class Money implements Expression {
    protected int amount;
    protected String currency;

    String currency() {
        return currency;
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public boolean equals(Object object) {
        if (object == null) return false;
        Money money;
        try {
            money = (Money) object;
        } catch (Exception e) {
            return false;
        }
        return amount == money.amount && currency().equals(money.currency());
    }

    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }
}
