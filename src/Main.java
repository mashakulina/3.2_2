public class Main {
    public static void main(String[] args) {

        int bill = 100; //изначальный баланс
        int refill = 1100; //пополнение счета на сумму

//        int bonus;
//        if (refill>1000) {
//            bonus = refill/100;
//        } else {
//            bonus = 0;
//        }

        int bonus = (refill > 1000) ? (refill / 100) : 0;

        System.out.println("Начисленно бонусов: " + bonus);
        System.out.println("Баланс: " + (refill + bill + bonus));

    }
}
