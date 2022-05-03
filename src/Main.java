public class Main {
    public static void main(String[] args) {

        int balance = 500; // баланс до пополнения счёта
        int topUpAmount = 300; // сумма пополнения

        int bonus;
        if (topUpAmount >= 500) {
            bonus = topUpAmount / 100;
        } else {
            bonus = 0;
        }

        int totalAmount = balance + topUpAmount + bonus;

        System.out.println("Итоговый счёт " + totalAmount);
        System.out.println("Количество бонусов " + bonus);
    }
}
