public class Account {

    int accountNo;
    String name;
    float amount;

    void insert(int a, String n, float amount) {

        this.accountNo = a;
        this.name = n;
        this.amount = amount;

    } // insert() ile kullanıcıdan bilgileri almış olduk.

    void deposit(float amt) {
        amount += amt;
        System.out.println(amt + " deposited.");
    } // added money to the account.

    void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("Insufficient balance.");
        } else {
            amount -= amt;
            System.out.println(amt + " withdrawn.");
        } //para çekme. (withdraw)

    }

    void checkBalance() {
        System.out.println("Balance is:" + amount);
    } // bakiye kontrolü (balance)

    void display() {

        System.out.println(accountNo + " " + name + " " + amount);

    } // genel hesap kontrolü

}
