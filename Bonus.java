public class Bonus {
    public static void main(String[] args) {
        int deposit = 100;
        int balance = 100;
        int total_balance = deposit + balance;

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100 + total_balance;
        } else { bonus = total_balance;
        }
        System.out.println(bonus);
    }
}