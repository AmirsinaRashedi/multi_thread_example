package part2;

public class CheckingAccount {

    private int balance;

    public CheckingAccount(int balance) {
        this.balance = balance;
    }

    public Boolean withdraw(int amount) {

        if (amount <= balance) {

            balance -= amount;

            try {

                Thread.sleep((int) (Math.random() * 200));

            } catch (InterruptedException ignored) {

            }

            return true;

        } else
            return false;

    }


}
