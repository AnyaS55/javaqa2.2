public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int cash = 1;
        int bonus = 1;

        if (cash > 1000) {
            balance = (balance + cash + cash / 100 * bonus);
            System.out.println(balance);
        } else {
            balance = (balance + cash);
            System.out.println(balance);
        }


    }


}
