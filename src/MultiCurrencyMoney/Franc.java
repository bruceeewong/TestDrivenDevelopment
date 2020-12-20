package MultiCurrencyMoney;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Franc dollar = (Franc) object;
        return this.amount == dollar.amount;
    }
}
