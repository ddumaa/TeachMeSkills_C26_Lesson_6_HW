package homework.exercise_1;

public class cardUsers {
    public static void main(String[] args) {
        CreditCard myCart1 = new CreditCard(1, 2645.54);
        CreditCard myCart2 = new CreditCard(2, 1023.98);
        CreditCard myCart3 = new CreditCard(3, 59.01);

        myCart1.addAmount(563);
        myCart2.addAmount(25);
        myCart3.withdraw(70);

        myCart1.balanceInfo();
        myCart2.balanceInfo();
        myCart3.balanceInfo();
    }
}
