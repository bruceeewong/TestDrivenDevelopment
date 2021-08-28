package MultiCurrencyMoney;

public class Money {
    protected int amount;

    Money(int amount) {
        this.amount = amount;
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    static Franc franc(int amount) {
        return new Franc(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && this.getClass() == object.getClass();
    }

    public Money times(int amount) {
        return new Dollar(amount);
    }
}
