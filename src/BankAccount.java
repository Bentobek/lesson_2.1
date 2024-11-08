public class BankAccount {
    private double amount;
    public double getAmount() {
        return amount;
    }


    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
            System.out.println("Вы внесли: " + sum + ". Текущий баланс: " + amount);
        } else {
            System.out.println("Сумма для внесения должна быть положительной.");
        }
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {

            throw new LimitException("Недостаточно средств на счете для снятия указанной суммы.", amount);
        } else {
            amount -= sum;
            System.out.println("Вы сняли: " + sum + ". Текущий баланс: " + amount);
        }
    }
}

