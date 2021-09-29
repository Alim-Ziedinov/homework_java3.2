public class Bonus {
    public static void main(String[] args) {
        int account = 1100;
        int balance = 100;
        int total = account + balance;

        int bonus;
        if (account > 1000) {
            bonus = account / 100;
        } else {
            bonus = 0;
        }
        int bonus2 = total + bonus;
        String str = String.format("Ваш бонус составил: %s.", bonus);
        System.out.println(str);
        String str1 = String.format("Ваш общий баланс: %s.", bonus2);
        System.out.println(str1);
    }
}