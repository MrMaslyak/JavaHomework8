public class BankAccount {
    private int totalMoney;
    private int savingsMoney;
    public BankAccount(int totalMoney, int savingsMoney) {
        this.totalMoney = totalMoney;
        this.savingsMoney = savingsMoney;
    }

    public void deposit(int dep){
        if (dep > 0) {
            totalMoney += dep;
            System.out.println("Деньги внесены: " + dep);
        } else {
            System.out.println("Некорректная сумма для внесения");
        }
    }

    public void withdraw(int withdrawAmount) {
        if (withdrawAmount > 0) {
            if (totalMoney >= withdrawAmount) {
                totalMoney -= withdrawAmount;
                System.out.println("Успешно снято: " + withdrawAmount);
            } else {
                System.out.println("Недостаточно средств на текущем счете. Попробуйте ваши накопления.");
                if (savingsMoney >= (withdrawAmount - totalMoney)) {
                    savingsMoney -= (withdrawAmount - totalMoney);
                    totalMoney = 0;
                    System.out.println("Успешно снято с накоплений: " + (withdrawAmount - totalMoney));
                } else {
                    System.out.println("Недостаточно средств на накопительном счете.");
                }
            }
        } else {
            System.out.println("Неверная сумма для снятия");
        }
    }

    public int getBalance() {
        return totalMoney;
    }
    public int getSavingsBalance() {
        return savingsMoney;
    }

}
