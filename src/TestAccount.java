public class TestAccount {

    public static void main(String[] args) {

        Account a1 = new Account();
        a1.insert(832345, "Enes", 2000);

        a1.display();

        a1.checkBalance();
        a1.deposit(1000);
        a1.checkBalance();
        a1.withdraw(4000);
        a1.checkBalance();
        a1.display();


        System.out.println();
        Account a2 = new Account();
        a2.insert(339115, "Eda", 1500);
        a2.checkBalance();
        a2.deposit(5000);
        a2.checkBalance();
        a2.display();


    }

}
