import java.util.Random;
import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rastgeleSayi = random.nextInt(10) + 1; // 1 ile 10 arasında rastgele sayı üretir
        int tahmin;
        boolean tahminDogru = false;

        System.out.println("1 ile 10 arasında bir sayıyı tahmin edin.");

        while (!tahminDogru) {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();

            if (tahmin < 1 || tahmin > 10) {
                System.out.println("Lütfen 1 ile 10 arasında bir sayı girin.");
            } else if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı deneyin.");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı deneyin.");
            } else {
                tahminDogru = true;
                System.out.println("Tebrikler, doğru tahmin! Sayı: " + rastgeleSayi);
            }
        }

        scanner.close();
    }
}
