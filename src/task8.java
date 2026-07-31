import java.util.ArrayList;

public class task8 {
    public static void main(String[] args) {
        ArrayList<BankAccount> hesablar = new ArrayList<>();

        hesablar.add(new BankAccount("1234567890987654", "Aysel Məmmədova", 3540.75));
        hesablar.add(new BankAccount("123456789876543", "Elvin Quliyev", 1200.00));
        hesablar.add(new BankAccount("1234567898765432", "Nərmin Əliyeva", 8900.50));

        for (BankAccount hesab : hesablar) {
            System.out.println("Hesab nömrəsi: " + hesab.hesabNomresi + " / Ad Soyad: " + hesab.accountHolder + "/ Balans: " + hesab.balance + " AZN");
        }
    }
}