package MultiCurrencyMoney;

interface Expression {
    Money reduce(Bank bank, String to);
}
