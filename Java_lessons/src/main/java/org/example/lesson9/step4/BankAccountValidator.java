package org.example.lesson9.step4;

/**
 * Метод проверяет активность счета и корректность баланса, при ошибке выбрасывает исключение.
 */
public class BankAccountValidator {
    public boolean validate(BankAccount bankAccount) {
        if (!bankAccount.isActive()) {
            throw new BankAccountException("Банковский счет не активный");
        }
        if (bankAccount.getBalance() < 0 && !bankAccount.isRedSaldo()) {
            throw new BankAccountException("Банковский счет не может быть негативным");
        }
        return true;
    }
}
