package homework.exercise_1;

public class CreditCard {
    int accountNumber;
    double amountAccount;
    public void addAmount (double summa){
        amountAccount += summa;
        System.out.println("The balance is replenished by the amount: " + summa);
    }
    public void withdraw (double summa){
        if(summa > amountAccount){
            System.out.println("Insufficient funds on balance");
        }else{
            amountAccount -= summa;
            System.out.println("Amount withdrawn");
        }
    }
    public void balanceInfo (){
        System.out.println("Your balance: " + amountAccount);
    }
    public CreditCard (int accountNumber2, double amountAccount2){
        accountNumber = accountNumber2;
        amountAccount = amountAccount2;
    }
}
