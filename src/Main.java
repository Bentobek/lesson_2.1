//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount();
    bankAccount.deposit(15000);

          while (true) {
            try {
                bankAccount.withDraw(5000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    bankAccount.withDraw((int) e.getRemainingAmount());
                } catch (LimitException ex) {
                    System.out.println("Ошибка при снятии оставшейся суммы.");
                }
                break;
            }
        }
    }
}
