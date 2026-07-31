public class task6 {
    public static void main(String[] args) {
        BankAccount hesab = new BankAccount("1234567890890", "Yuliya Suxareva", 3540.75);

        System.out.println("Hesab nömrəsi: " + hesab.hesabNomresi);
        System.out.println("Ad Soyad: " + hesab.accountHolder);
        System.out.println("Balans: " + hesab.balance + " AZN");
    }
}

class BankAccount {
    String hesabNomresi;
    String accountHolder;
    double balance;

    public BankAccount(String hesabNomresi, String accountHolder, double balance) {
        this.hesabNomresi = hesabNomresi;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
}