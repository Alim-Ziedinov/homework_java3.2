public class Bonus {
    public static void main(String[] args) {
        int deposit = 1100;
        int balance = 100;
        int totalBalance = deposit + balance;

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100 + totalBalance;
        } else { bonus = totalBalance;
        }
        System.out.println(bonus);
    }
}