package homework.exercise_1;

/**
 * Задача 1
 * Создать класс CreditCard c полями номер счета, текущая сумма на счету.
 * Создайте один конструктор с двумя параметрами.
 * Добавьте метод, который позволяет начислять сумму на кредитную карточку. Метод принимает на вход сумму и добавляет эту сумму к текущей.
 * Подуймайте, как стоит задать входные и выходные параметры метода.
 * Добавьте метод, который позволяет снимать с карточки некоторую сумму. Метод принимает на вход сумму и отнимает эту сумму от текущей.
 * Подуймайте, как стоит задать входные и выходные параметры метода.
 * Добавьте метод, который выводит текущую информацию о карточке.
 * Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
 * Тестовый сценарий для проверки:
 * Положите деньги на первые две карточки и снимите с третьей.
 * Выведите на экран текущее состояние всех трех карточек.
 */
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
