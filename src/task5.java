public class task5 {
    public static void main(String[] args) {
        double[] balanslar = {3540098.75, 1208900.00, 8900090.50, 62900.25, 4750.00};

        double enYuksekBalans = balanslar[0];
        for (double balans : balanslar) {
            if (balans > enYuksekBalans) {
                enYuksekBalans = balans;
            }
        }
        System.out.println("Ən yüksək balans: " + enYuksekBalans + " AZN");
    }
}