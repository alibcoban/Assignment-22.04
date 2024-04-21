import java.util.Scanner;

public class doWhileDongusu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tahmin;
        int rastgeleSayi = (int) (Math.random() * 100) + 1; // 1 ile 100 arasında rastgele sayı üretir

        do {
            System.out.print("Lütfen 1 ile 100 arasında bir sayı girin: ");
            tahmin = scanner.nextInt();

            if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı girin.");
            } else if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else {
                System.out.println("Tebrikler, sayıyı doğru tahmin ettiniz!");
            }
        } while (tahmin != rastgeleSayi);

        scanner.close();
    }
}
