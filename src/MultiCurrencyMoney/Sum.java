package MultiCurrencyMoney;

public class Sum implements Expression {
    private final Money augend;
    private final Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String to) {
        return new Money(augend.amount + addend.amount, to);
    }
}
